package chapter02

class Book{
    var name:String = ""
    var price:Int = 0
    private val maxPrice = 100_000

    fun increasePrice(increase: Int){
        price += increase
        if(price > maxPrice)
            price = maxPrice
    }

}

fun main() {
    val mathBook = Book()
    mathBook.name = "수학의 정석"
    mathBook.price = 4000
    println(mathBook.name)
    println(mathBook.price)
    mathBook.increasePrice(500)
    println(mathBook.price)

    val englishBook = Book()
    englishBook.name = "영어 일주일만에 완전 정복 !"
    englishBook.price = 99000
    println(englishBook.name)
    println(englishBook.price)
    englishBook.increasePrice(2000)
    println(englishBook.price)

}

/**
 * property 는 클래스에 속한 var 이나 val 이다.
 * property 를 작성함으로써 클래스 안에서 상태를 유지한다.
 * var property 는 재대입이 가능하지만, val 은 그렇지 않다.
 * 각각의 객체는 property 를 저장할 자신만의 공간을 따로 할당 받는다.
 *
 *
 * */