package com.example.introduction_kotlin

import java.lang.IllegalArgumentException

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

    forAndWhile()

//    nullcheck()
//    ignoreNulls(null)
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

/**
 * 6. 반복문 (for, while)
 *
 */

fun forAndWhile(){
    val students = arrayListOf("a", "b", "c", "d")

    for(name in students){
        println("${name}")
    }

    for((index, name) in students.withIndex()){
        println("${index} 번째 학생: ${name}")
    }

    var sum : Int = 0
    for(i in 1..10 step 2){ // step 2씩 띄워서 계산하기 + downTo[10부터 차례로 내려오기] + until 100 [100을 포함 하지 않음 1~99]
        sum += i
    }
    println(sum)

    var index = 0
    while(index<10){
        println("current index : ${index}")
        index++
    }
}
/**
 * 7. nullable / Nonnull
 */
fun nullcheck(){
    // NPE : Null pointer Exception
    var name : String = "ari" // nonnull type
    var nullName : String? = null // ? 를 붙여주면 nullable type string이 됨

    var nameInUpperCase = name.toUpperCase()
    var nullNameInUpperCase = nullName?.toUpperCase() //-> null인지 아닌지 몰라서, null을 사용해도 되는지 모르겠음
    // null이면 null로 반환해줌

    // ? : 엘베스 프레슬리 연산자

    val lastName : String? = "null"
//    val fullName = name + " " + (lastName?: "No lastName")
    val fullName = lastName ?: throw IllegalArgumentException("No last name")
    println(fullName)

}


// !! : nullable type으로 지정되어 있지만 null이 아닌 것을 나타내는 연산자
fun ignoreNulls(str : String?){
    val mNotnull : String = str!! // complier에게 null일리가 없으니까 아니라고 생각하라고 알려줌
    val upper = mNotnull.toUpperCase()


    val email: String ? = "123@gnana.com"
    email?.let { // email 이 null이 아니면 let으로 실행하라 
        // 자신의 객체를 lamda 식 내부로 옮겨줌
        println("my email is ${email}")
    }
}
