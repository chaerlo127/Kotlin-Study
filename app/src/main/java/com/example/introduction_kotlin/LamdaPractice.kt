package com.example.introduction_kotlin

/**
 * Lamda: value 처럼 다룰 수 있는 익명 함수와 비슷한 것
 * 자바에서 익명 함수와 비슷,
 * 1) method에 파라미터로 넘겨줄 수 있다. fun maxBy(a : Int)
 * 2) return  값으로 사용할 수 있다.
 *
 * 람다의 기본 정의]
 * val lamdaName : Type = { argumentList -> codeBody }
 *
 */

// parameter는 무조건 소괄호를 써주어야 한다.
val square : (Int) -> (Int) = {number -> number * number}
//val square = {number:Int -> number * number}

val nameAge = {name : String, age : Int -> "my name is ${name} I'm ${age}"}

fun main(){
    println(square(12))
    println(nameAge("ari", 22))
    val a = "ari said"
    println(a.pizzaIsGreat())

    println(extendString("ari", 22))

    println(calculateGrade(97))

    val lamda = {number : Double ->
        number == 4.3213
    }
    println(invokeLamda(lamda))
    println(invokeLamda({ true }))
    println(invokeLamda({it > 3.22}))
    
    //모두 같음
    // function의 마지막 parameter가 Lamda 식일 때 이와 같은 식이 가능 함.
    invokeLamda { it>3.22 }
    invokeLamda(){ it>3.22 }

}

/**
 * 확장 함수
 */
val pizzaIsGreat : String.() -> String = { // this = String Object 그 자체를 가리킨다.
    this + "Pizza is the best!"
}

fun extendString(name : String , age : Int) :String {
    // this는 call 하는 Object를 가리키고, 하나 들어가는 파라미터일 경우에는 it으로 가리킨다. 생략이 가능하다.
    val introduceMySelf : String.(Int) -> String = {
        "I am ${this} and ${it} years old"
    }
    return name.introduceMySelf(age)
}

/**
 * 람다의 return
 * 마지막 한줄, 표현식이 return 값
 */
val calculateGrade : (Int) -> String ={
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
    // 0~100이 아닌 정수는 else로 작성해주어야 에러가 발생하지 않는다.
}

/**
 * 람다를 표현하는 여러가지 방법
 */
fun invokeLamda(lamda : (Double) -> Boolean): Boolean{
    return lamda(5.2343)
}