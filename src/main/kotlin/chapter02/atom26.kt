package chapter02

import atomictest.eq

fun main() {
    val numberSet = setOf<Number>(1,1,2,2,2,2,2,3,3)
    numberSet eq setOf<Number>(1,2,3)

    numberSet eq setOf<Number>(2,3,1)

    (1 in numberSet) eq true
    (4 in numberSet) eq false

    numberSet.contains(1) eq true
    numberSet.contains(4) eq false

    val numberList = listOf<Number>(1,1,1,1,2,2,2,3,3,3)

    numberList.toSet() eq numberSet
    numberList.distinct() eq numberSet
}

/**
 * Set 은 각각의 값이 오직 하나만 존재할 수 있는 Collection 이다.
 * Set 을 활용해 합집합, 차집합, 교집합의 결과를 알 수 있다.
 * 각각 union, subtract, intersect 로 감싸서 알 수 있다.
 * setOf 은 읽기 전용이다.
 * 가변이 필요하면 mutableSetOf 를 쓰자.
 * list 와 마찬가지로 += 연산을 사용할 수 있다.
 * */