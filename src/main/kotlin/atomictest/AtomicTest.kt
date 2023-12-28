package atomictest

import kotlin.math.abs
import kotlin.reflect.KClass

/**
 * 저자가 이 책을 편하게 읽을 수 있도록 만든 작은 시스템
 *
 *  - 식의 예상 결과 값을 보여준다
 *  - 프로그램이 실행되고 있음을 알 수 있도록 출력을 제공한다. 혹 모든 테스트가 성공해도 출력을 제공한다.
 *  - 개발을 배우는 과정에서 더 빨리 테스트의 개념을 몸에 익히게 한다.
 * */

const val ERROR_TAG = "[Error]: "

private fun <L, R> test(
    actual: L,
    expected: R,
    checkEquals: Boolean = true,
    predicate: () -> Boolean
) {
    println(actual)
    if (!predicate()) {
        print(ERROR_TAG)
        println("$actual " +
                (if (checkEquals) "!=" else "==") +
                " $expected")
    }
}

/**
 * Compares the string representation
 * of this object with the string `rval`.
 */
infix fun Any.eq(rval: String) {
    test(this, rval) {
        toString().trim() == rval.trimIndent()
    }
}

/**
 * Verifies this object is equal to `rval`.
 */
infix fun <T> T.eq(rval: T) {
    test(this, rval) {
        this == rval
    }
}

/**
 * Verifies this object is != `rval`.
 */
infix fun <T> T.neq(rval: T) {
    test(this, rval, checkEquals = false) {
        this != rval
    }
}

/**
 * Verifies that a `Double` number is equal
 * to `rval` within a positive delta.
 */
infix fun Double.eq(rval: Double) {
    test(this, rval) {
        abs(this - rval) < 0.0000001
    }
}

/**
 * Holds captured exception information:
 */
class CapturedException(
    private val exceptionClass: KClass<*>?,
    private val actualMessage: String
) {
    private val fullMessage: String
        get() {
            val className =
                exceptionClass?.simpleName ?: ""
            return className + actualMessage
        }
    infix fun eq(message: String) {
        fullMessage eq message
    }
    infix fun contains(parts: List<String>) {
        if (parts.any { it !in fullMessage }) {
            print(ERROR_TAG)
            println("Actual message: $fullMessage")
            println("Expected parts: $parts")
        }
    }
    override fun toString() = fullMessage
}

/**
 * Captures an exception and produces
 * information about it. Usage:
 *    capture {
 *      // Code that fails
 *    } eq "FailureException: message"
 */
fun capture(f:() -> Unit): CapturedException =
    try {
        f()
        CapturedException(null,
            "$ERROR_TAG Expected an exception")
    } catch (e: Throwable) {
        CapturedException(e::class,
            (e.message?.let { ": $it" } ?: ""))
    }

/**
 * Accumulates output when called as in:
 *   trace("info")
 *   trace(object)
 * Later compares accumulated to expected:
 *   trace eq "expected output"
 */
object trace {
    private val trc = mutableListOf<String>()
    operator fun invoke(obj: Any?) {
        trc += obj.toString()
    }
    /**
     * Compares trc contents to a multiline
     * `String` by ignoring white space.
     */
    infix fun eq(multiline: String) {
        val trace = trc.joinToString("\n")
        val expected = multiline.trimIndent()
            .replace("\n", " ")
        test(trace, multiline) {
            trace.replace("\n", " ") == expected
        }
        trc.clear()
    }
}