package chapter02

import atomictest.eq

fun main() {
    val userMap = mapOf<Long, String>(0L to "admin")

    userMap[0] eq "admin"

    val foodMap = mutableMapOf<String, Int>("meat" to 4000)

    foodMap += "pizza" to 3000

    foodMap["meat"] eq 4000
    foodMap["pizza"] eq 3000
}

/**
 * Map 은 key 와 value 를 연결하고, 키가 주어지면 그 키와 연결된 값을 찾아준다.
 * */