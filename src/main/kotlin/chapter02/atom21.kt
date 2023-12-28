package chapter02

import kotlin.math.PI
import kotlin.math.cos

fun main() {
    println(PI)
    println(cos(PI))
    println(cos(2*PI))

}

/**
 * 프로그래밍에서 근본적인 원칙은 DRY, 즉 "반복하지 말라(Don't Repeat Yourself)" 는 의미를 지닌 약자로 나타낼 수 있다.
 *
 * 코드에서 같은 내용이 여러 번 반복되면, 이를 수정하거나 개선할 때마다 더 많은 유지 보수가 필요해진다.
 * 코드가 중복되는 건 이런 추가 노력이 필요할 뿐만 아니라 반복이 추가될 때마다 실수할 가능성이 커진다는 뜻이기도 하다.
 *
 * import 키워드를 써서 다른 파일에 정의된 코드를 재사용할 수 있다.
 *
 * package 는 연관 있는 코드를 모아둔 것이다.
 * 각 패키지는 보통 특정 문제를 풀기 위해 고안되며, 여러 함수와 클래스를 포함하곤 한다.
 * */