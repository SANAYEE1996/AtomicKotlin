package chapter02

fun variableListSum(vararg number: Int):Int{
    return number.sum();
}

fun main() {
    println(variableListSum(1,2,3,4,5))
    println(variableListSum(3,2,34,13,46))
    println(variableListSum(4,4,4,4,1,46))
}

/**
 * vararg 키워드는 길이가 변할 수 있는 인자 목록을 만든다.
 * vararg 키워드를 사용하면 listOf 처럼 임의의 길이로 인자를 받을 수 있는 함수를 정의할 수 있다.
 * vararg == variable argument list
 * 함수 정의에는 vararg 로 선언된 parameter 가 최대 하나만 있어야 한다.
 * 이 parameter 는 Array로 취급된다. list 처럼 생각하지말고 함수 인자로 받아올 때 주의하자.
 *
 * */