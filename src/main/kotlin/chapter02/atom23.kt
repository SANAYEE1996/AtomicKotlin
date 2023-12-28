package chapter02

import atomictest.capture
import atomictest.eq

fun errorCode(){
    val i = "KKK".toInt()
}

private fun divide(a: Int, b: Int): Double{
    if(b == 0) throw IllegalArgumentException("can not divide to zero")
    return a.toDouble() / b
}

fun main() {
    capture {
        errorCode()
    } eq "NumberFormatException: " + """For input string: "KKK""""

    /**
     * capture() 는 일반 프로그래밍에는 그리 유용하지 않다.
     * 예외 메시지를 독자에게 보여주는 동시에 빌드 시스템을 통과시켜야 하는 이 책을 위해 특별히 고안된 함수.
     * */

    "헤헤".toIntOrNull() eq null

    capture {
        divide(100, 0)
    } eq "IllegalArgumentException: " + "can not divide to zero"
}

/**
 * exception 은 "I take exception to that 에 있는 exception 과 같은 뜻으로 쓰인다.
 * */