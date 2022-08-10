package com.example.introduction_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /**
     * navigation을 controll 하는 controller
     * 지금 정의하는 것이 아니라 나중에 initialize, 정의 해줄 것이기 때문에 lateinit
     */


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //navController 정의 함. 자동으로 찾아줌
//        navController = Navigation.findNavController(this, R.id.nav_host_fragment) -> error 뜸
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

    }
}



/*override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)

       button.setOnClickListener(object : OnClickListener{
           override fun onClick(p0: View?) {
           }
       })

       *//**
 * 람다 식으로 onclick 사용 가능
 * 1. Kotlin interface가 아닌 자바 인터페이스여야 함.
 * 2. 그 인터페이스는 딱 하나의 메소드만 가져야 함
 *//*
        button.setOnClickListener{

        }
    }*/