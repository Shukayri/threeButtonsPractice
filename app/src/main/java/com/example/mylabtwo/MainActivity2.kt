package com.example.mylabtwo

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tv3: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tv3 = findViewById(R.id.textView)

        val str1 = intent.getStringExtra("myName")
        val str2 = intent.getStringExtra("myLoc")
        val str3 = intent.getStringExtra("myMob")

            tv3.text = "$str1 $str2 $str3"
    }
}