package com.example.introduction_kotlin

fun main(){
    helloWorld()
    println(add(4, 5))

    /**
     * 3. String Template
     */
    val name = "ari"
    val lastName = "chang"
    println("my name is ${name + lastName} I'm 22")
    println("this is 2\$a") // $를 문자로 사용할 때 필요한 백슬래쉬

    checkNumber(1)
}

/**
 * 1. 함수
 */

fun helloWorld() : Unit{ // Unit = void, Unit은 생략이 가능함.
    println("Hello World!")
}

fun add(a : Int, b : Int) : Int{ // 변수가 뒤에 온다. Int가 대문자이다.
    return a+b
}

/**
 * 2. val vs var
 * 
 * val = value 변하지 않는 값 [상수]
 * var 변할 수 있는 값 [변수]
 */
fun hi(){
    val a : Int = 10 
    var b : Int = 9

    var e : String
//    a = 100 불가능
    b = 100 // 가능

    val c = 100 // Int로 따로 적어두지 않아도 됨. 알아서 변경해줌. 자동 추론 가능
    var d = 100
    
    var name = "ari"
}

/**
 * 4. 조건식
 */
fun maxBy(a:Int, b:Int) : Int{
    if(a>b) return a
    else return b
}

fun maxBy2(a:Int, b:Int) = if(a>b) a else b

fun checkNumber(score :Int){
    when(score) { // when ~ else
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
    }// = switch

    var b = when(score){ // 리턴식으로 사용가능
        1 -> 1
        2 -> 2
        else -> 3
    }
    println("b: ${b}")
    when(score){ // when ~ in ~ else
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

/**
 * Expression vs Statement
 *
 * Expression : 메소드 내에서 값을 만들면 -> 1 -> 1
 * 코틀린의 모든 함수는 Expression [return 값이 없더라도]
 * Statement : 실행하도록 만드는 것 -> println("this is 0")
 */

/**
 * 5. Array and List
 * Array는 정해져 있는 사이즈가 있음. [mutable : 수정 가능]
 * List는 1. List[수정 불가능, unmutable], 2. MutableList[수정가능]
 */
fun array(){
    val array = arrayOf(1, 2, 3) // 초기화
    val list = listOf(1, 2, 3) // 초기화

    val array2 = arrayOf(1, "d", 3, 4f)
    val list2 = listOf(1, "d", 3, 4f)

    array[0] = 3
//    list[0] = 2 //error
    list.get(0)

    val arrayList = arrayListOf<Int>() // 참조값 자체가 변하는 것이 아닌 arraylist의 내부 값이 변하는 것으로 var, val 모두 사용 가능
    arrayList.add(10)
    arrayList.add(20)

}
