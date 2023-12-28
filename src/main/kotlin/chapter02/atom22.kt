package chapter02

import atomictest.*

fun main() {
    val number = 37
    val word = "Seven"

    number eq 37
    word eq "Seven"

    number eq word

    calculateBMI(68.0, 1.754) eq "Normal Weight"
    calculateBMI(90.4, 1.600) eq "Over Weight"
    calculateBMI(68.0, 1.980) eq "Under Weight"
}

fun calculateBMI(weight: Double, height: Double): String{
    val bmi = weight/ ( height* height )
    return if (bmi < 18.5) "Under Weight"
    else if(bmi < 25) "Normal Weight"
    else "Over Weight"
}

/**
 * 프로그램을 빠르게 개발하려면 지속적인 테스트가 필수다.
 *
 * 프로그램의 일부분인 테스트
 * 테스트는 소프트웨어 개발 과정에 포함되어 있어야 가장 효과적이다.
 * 테스트를 작성하면 원하는 결과를 확실히 얻을 수 있다.
 * 코드를 작성하기 전에 테스트를 먼저 작성해 실패시킨 후, 나중에 테스트를 통과하도록 코드를 작성한다.
 * 이를 Test Driven Development 라고 한다.
 * TDD 는 자신이 생각하는 대상을 정말로 테스트하고 있는지 확실히 확인할 수 있는 방법이다.
 *
 *
 * */