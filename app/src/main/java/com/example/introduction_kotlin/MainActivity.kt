package com.example.introduction_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
            }
        })

        /**
         * 람다 식으로 onclick 사용 가능
         * 1. Kotlin interface가 아닌 자바 인터페이스여야 함.
         * 2. 그 인터페이스는 딱 하나의 메소드만 가져야 함
         */
        button.setOnClickListener{

        }
    }
}