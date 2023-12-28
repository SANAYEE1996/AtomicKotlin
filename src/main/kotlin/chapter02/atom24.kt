package chapter02

import atomictest.eq

fun main() {
    var numberList = listOf<Int>(13,7,23,56,1,100)
    numberList eq "[13, 7, 23, 56, 1, 100]"

    var sum = 0;
    for(i in numberList) sum += i

    sum eq numberList.sum()

    numberList[5] eq 100

    val nameList = mutableListOf<String>()

    nameList.add("park")
    nameList.addAll(listOf("Dong", "Hong"))

    nameList += "Gil"
    nameList += listOf("Hwang")

    nameList[3] eq "Gil"

    val lottoList = listOf<Int>(1,4)

    // lottoList += listOf<Int>(3,5)
}

/**
 * List 는 container, 즉 다른 객체를 담는 객체에 속한다.
 * 컨테이너는 Collection 이라고도 한다.
 * List 는 표준 코틀린 패키지에 들어 있기 때문에 import 를 할 필요가 없다.
 *
 * listOf() 는 불변 리스트를 생성하지만 var 타입이면 += 또는 addAll이 가능하다.
 * val 타입이면 불가능하다. 그래서 += 연산은 컴파일 될 수 없다.
 *
 * 이런 += 동작은 다른 컬렉션에서도 마찬가지다.
 * 이로 인해 발생할 수 있는 혼동을 방지하는 것도 식별자를 정의할 때 var 보다는 val 을 써야하는 이유가 된다.
 * */