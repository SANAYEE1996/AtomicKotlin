package chapter02

class User{
    fun speak() = "user speak"
    fun buy(product: Product){
        println("buy product $product")
    }
}
class Product{

}

fun main() {

    val user1 = User()
    val user2 = User()

    val product1 = Product()
    val product2 = Product()

    println(user1)
    println(user2)

    println(product1)
    println(product2)

    println(user1.speak())
    user1.buy(product1)
    user1.buy(product2)

    println(user2.speak())
    user2.buy(product1)
}


/**
 * 클래스 본문 안에 정의된 함수는 해당 클래스에 속한다.
 * 코틀린에서는 이런 함수를 클래스의 멤버 함수라고 부른다.
 * 자바와 같은 객체지향 언어에서는 메서드라고 부르기도 하지만,
 * 코틀린의 함수적인 특성을 강조하고 메서드/함수의 구분이 초보자에게 혼란을 야기할 수 있기 때문이다.
 * 
 * 멤버 함수 : 클래스에 속한 함수
 * 최상위(top-level) 함수: 클래스에 속하지 않은 함수
 * */