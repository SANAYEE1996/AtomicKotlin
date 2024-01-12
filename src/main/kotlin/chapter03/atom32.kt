package chapter03

import atomictest.eq

class Something{
    fun f() = 0
    fun f(n:Int) = n*2
}

fun main() {

    val some = Something()

    some.f() eq 0
    some.f(10) eq 20
}

/**
 * default 인자를 지원하지 않는 언어에서는 종종 default 인자를 흉내 내기 위해 overloading 을 활용한다.
 *
 * overloading : parameter 목록이 여러 다른 함수에 같은 이름을 사용하는 것.
 * 함수의 signature 는 함수 이름, parameter 목록, return type 으로 이뤄진다.
 * 함수를 overloading 할 때는 함수 parameter 목록을 서로 다르게 만들어야 한다.
 * 함수의 return type 은 overloading 대상이 아니다.
 *
 *
 *
 * */