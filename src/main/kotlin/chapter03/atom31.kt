package chapter03

import atomictest.eq

fun color(red: Int, green: Int, blue: Int) = "($red, $green, $blue)"

fun color(red: String = "FF", green: String = "FF", blue: String = "FF") = "$red$green$blue"

fun main() {

    color(44,44,44) eq "(44, 44, 44)"

    color(red = 77, blue = 49, green = 56) eq "(77, 56, 49)"

    color(red = "ee") eq "eeFFFF"
}

/**
 *
 * 함수를 호출하면서 인자의 이름을 지정할 수 있다.
 *
 * */