package chapter02

private var index = 0

private class SmartPhone(val name: String){

}

private fun filterPhone(smartPhone: SmartPhone){
    println("this phone name : ${smartPhone.name}")
    if(smartPhone.name.contains("galaxy")){
        println("jae dragon cheer up !!")
    }
}

fun main() {
    filterPhone(SmartPhone("iphone"))
    filterPhone(SmartPhone("super galaxy"))
    filterPhone(SmartPhone("pen pine apple pan"))
}

/**
 * 작성한 코드를 며칠 또는 몇 주 동안 보지 않다가 다시 살펴보면, 그 코드를 작성하는 더 좋은 방법이 보일 수도 있다.
 * --> refactoring 을 하는 주된 이유
 * --> refactoring 은 코드를 고쳐 써서 더 읽기 좋고 잏애하기 쉽게, 그래서 더 유지보수 하기 쉽게 만드는 것.
 * 
 * ==> 변화해야 하는 요소와 동일하게 유지되어야 하는 요소를 분리하라
 *
 * public, private, protected, internal 등의 access modifier 를 사용하여,
 * 클라이언트 프로그래머가 어떤 부분에 접근 할 수 있고 어떤 부분에 접근 할 수 없는지를 결정한다.
 *
 * private 키워드는 같은 클래스에 속한 멤버 외에는 아무도 이 멤버에 접근 할 수 없다.
 * 내부 구현을 노출시켜야 하는 경우를 제외하고는 property 를 private 으로 만들라.
 *
 * 한 객체에 대한 참조를 여러 개 유지하는 경우를 aliasing 이라고 하며, 이로 인해 놀랄만한 동작을 수행할 수 있다.
 *
 * module - 코드 기반상엥서 논리적으로 독립적인 각 부분.
 *
 *
 * */