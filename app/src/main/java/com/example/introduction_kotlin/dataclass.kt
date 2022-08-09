package com.example.introduction_kotlin

/**
 * 데이터 클래스
 * pojo : 모델이 되는 클래스, 메소드가 작동하는 것이 아니라 메소드가 있어서 특정행동을 하는 클래스가 아니라 비어있는 틀 역할을 하는 것
 * 자바는 pojo class를 위해서 직접 써줘야 했음.
 * 쓸데없는 코드를 코틀린에서는 줄여줌. [data class] : 데이터를 담는 클래스
 */
/**
 * 코틀린은 한 파일 안에서 여러가지 클래스를 만들 수 있다. 연관된 데이터 클래스는 하나의 파일에 다 모아서 만들 수 있음.
 * 관리하기 편하다. 자바는 이를 하지 못함.
 */
data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
// toString(), hashCode(), equals(), copy()를 자동으로 만들어 줌

class TicketB(val companyName : String, val name : String, var date : String, var seatNumber : Int)

fun main(){
    val ticketA = Ticket("koreanAir", "ari", "2022-08-09", 22)
    val ticketB = TicketB("koreanAir", "ari", "2022-08-09", 22)

    println(ticketA) // constructor 의 값
    println(ticketB) // 메모리 주소 값
}