package com.example.introduction_kotlin
/**
 * 8. class
 * kotlin의 class는 final class
 * 부모 객체로서 사용되려면 [extends] class 앞에 "open"을 붙여줘야 함.
 * 부모 객체 내부 method로서 사용되려면 method 앞에 "open"을 붙여줘야 함.
 */
open class Human constructor(name: String = "Anonymous"){ // val human = Human()으로 객체를 생성하면 name에 Annonymous를 저장한다.
//    class Human constructor(val name: String){
//    class Human (val name: String){
    constructor(name: String, age : Int) : this(name) {
        println("my name is ${name}, ${age}years old")
    }
    // 주 생성자
    init {
        println("New human has been born!!")
    }
    val name = name
    fun eatingCake(){
        println("this is so YUMMYYY~~~~~~``")
    }
    open fun singASong(){
        println("lalala")
    }
}
// override
class Korean : Human() {
    override fun singASong(){
        super.singASong()
        println("라라랄라")
        println("my name is ${name}") // name의 기본 생성 이름을 받아왔기 때문에 Anonymous를 불러온다.
    }
}
fun main(){
//    val human = Human("ari")
//    val stranger = Human()
//    human.eatingCake()

    val mom = Human("kuri", 52)
//    println("this human's name is ${human.name}")
//    println("this human's name is ${stranger.name}")

    val korean = Korean()
    korean.singASong()

}