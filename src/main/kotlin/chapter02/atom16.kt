package chapter02

fun main() {
    val range1 = IntRange(0,100)

    val range2 = IntRange(-33,29)

    println(range1)
    println(range2)

    println(range1.sum())
    println(range2.sum())

    val name = "Park Young Sang"

    println(name)
    println(name.reversed())
    println(name.lowercase())
}

/**
 * 객체는 property(val and var)를 사용해서 데이터를 저장하고,
 * 함수를 사용해 이런 데이터에 대한 연산을 수행.
 *
 * */