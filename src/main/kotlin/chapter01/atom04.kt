package chapter01

fun main(){
    println("3 + 5 = ${addFunction(3,5)}")
    val bigNumber = addFunction(100, 100000)
    println(bigNumber)

    println("1 dollar : ${changeToUSD(1)} won")
    println("1 euro : ${changeToEUR(1)} won")
}

fun addFunction(a: Int, b: Int): Int{
    return a+b
}

fun changeToUSD(x: Int): Int = x*1303

fun changeToEUR(x: Int) = x*1434