package chapter02

class Animal(name: String, growl: String){
    var name: String = name
    var growl: String = growl

    fun growling() = println(name+" is growling !! :: "+ growl)

    override fun toString(): String {
        return name+ " and growl : " +growl
    }
}

fun main() {
    val tiger = Animal("호랑이", "으르렁~~~")
    val bear = Animal("곰", "크헝~~~")

    tiger.growling()
    bear.growling()

    println(tiger.toString())
    println(bear.toString())
}


/**
 * Constructor 에 정보를 전달해 새 객체를 초기화할 수 있다.
 * 코틀린에서는 new 가 불필요한 중복이라 제외한다.
 *
 * */