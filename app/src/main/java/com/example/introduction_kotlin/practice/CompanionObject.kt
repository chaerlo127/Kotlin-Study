package com.example.introduction_kotlin

// 정적인 변수, object, method를 사용할 때 CompanionObject를 사용

class Book private constructor(val id: Int, val name : String){
    // companion은 private object나 properties를 불러올 수 있도록 하는 것이다.
    // 자바의 static과 같이 사용되는 것이다.
    // 이름 선언이 가능하고, 인터페이스 상속도 가능하다.

    companion object BookFactory: IdProvider{
        override fun getId(): Int {
            return 444
        }
        val myBook = "harry potter"
        fun create() = Book(getId(), myBook)
    }


}

interface IdProvider{
    fun getId() : Int
}
fun main(){
    val book = Book.create()
    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
}