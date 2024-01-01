package chapter02

import atomictest.capture
import atomictest.eq

fun main() {
    val userMap = mapOf(0L to "admin")

    userMap[0] eq "admin"

    val foodMap = mutableMapOf("meat" to 4000)

    foodMap += "pizza" to 3000

    foodMap["meat"] eq 4000
    foodMap["pizza"] eq 3000

    foodMap.keys eq setOf("meat", "pizza")
    foodMap.values eq "[4000, 3000]"

    var s = ""
    for(i in foodMap){
        s += "${i.key}=${i.value},"
    }
    s eq "meat=4000,pizza=3000,"

    capture {
        foodMap.getValue("hamburger")
    } eq "NoSuchElementException: Key hamburger is missing in the map."

    foodMap.getOrDefault("hamburger", 0) eq 0
}

/**
 * Map 은 key 와 value 를 연결하고, 키가 주어지면 그 키와 연결된 값을 찾아준다.
 *
 * [] 연산자는 키를 사용해 값을 검색한다. keys 를 사용하여 모든 키를, values 를 사용하여 모든 값을 얻을 수 있다.
 * 이터레이션을 수행하면서 키와 값을 분리할 수 있다.
 *
 * 일반 Map 은 읽기 전용이다. mutableMapOf 은 가변 map 이다.
 * 둘 모두 원소가 map 에 전달된 순서를 유지해준다.
 *
 * 주어진 키에 해당하는 원소가 포함되어 있지 않으면 map 은 null 을 반환한다.
 * null 이 될 수 없는 결과를 원한다면 getValue 를 사용하라, 키가 맵에 들어 있지 않으면 NoSuchElementException 이 발생한다.
 *
 * 일반적으로 getOrDefault() 가 null 을 반환하거나 예외를 던지는 함수보다는 더 나은 대안이다.
 * */