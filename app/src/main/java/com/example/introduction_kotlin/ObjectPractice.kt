package com.example.introduction_kotlin

/**
 * Object는 class가 실행될 때 딱 한번만 만들어지는 객체
 * == 싱글톤 패턴
 * 불필요한 메모리 생성되지 않음.
 */
object CarFactory{
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int) : Car{
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}
data class Car(val horsePower: Int)

fun main(){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)
    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}