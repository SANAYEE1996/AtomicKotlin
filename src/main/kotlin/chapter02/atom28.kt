package chapter02

import atomictest.eq
import atomictest.trace

class Data(var i: Int){
    var number: Int = i
        get(){
            trace("get()")
            return field
        }
        set(value){
            trace("set($value)")
            field = value
        }
}

fun main() {

    val input = Data(10)

    input.i eq 10

    val input1 = Data(15)

    input1.i = 20

    trace(input1.i)
    trace eq """
       set(20)
       get()
       20
    """
}

/**
 * property 이름을 사용해 property 를 읽는다. 대입 연산자 = 을 사용해 가변 프로퍼티에 값을 대입한다.
 * 코틀린은 함수를 호출해 property 읽기와 쓰기 연산을 수행한다.
 * getter : property 값을 얻기 위해 사용하는 접근자
 * setter : 가변 property 를 갱신하기 위해 사용하는 접근자
 * getter 와 setter 안에서는 field 라는 이름을 사용해 저장된 값에 직접 접근할 수 있다.
 * property 를 private 으로 정의하면 두 접근자 모두 private 이 된다.
 *
 * 코틀린 스타일 가이드에서는 계산 비용이 많이 들지 않고, 객체 상태가 바뀌지 않는 한 같은 결과를 내놓는 함수의 경우
 * property 를 사용하는 편이 낫다고 안내한다.
 *
 * property 접근자는 property 에 대한 일종의 보호수단을 제공한다.
 *
 * */