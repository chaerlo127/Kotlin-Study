package com.example.introduction_kotlin

fun main(){
    helloWorld()
    println(add(4, 5))
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

