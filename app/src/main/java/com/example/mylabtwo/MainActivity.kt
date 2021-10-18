package com.example.mylabtwo

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
     lateinit var toabtn: Button
     lateinit var tvbtn: Button
     lateinit var gobtn: Button
     lateinit var edname: EditText
     lateinit var edloc: EditText
     lateinit var edmob: EditText
     lateinit var tv1: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toabtn = findViewById(R.id.LeftBtn)
        tvbtn = findViewById(R.id.middleBtn)
        gobtn = findViewById(R.id.RightBtn)

        edname = findViewById (R.id.tvEnterName)
        edloc = findViewById(R.id.tvEnterLocation)
        edmob = findViewById(R.id.tvEnterMobile)

        tv1 =findViewById(R.id.tvOne)


        toabtn.setOnClickListener {
            val name = edname.text.toString()
            val loc = edloc.text.toString()
            val mob = edmob.text.toString()
            val toast = Toast.makeText(applicationContext, "$name $loc $mob", Toast.LENGTH_LONG)
            toast.show()

        }
        tvbtn.setOnClickListener {
            val name = edname.text.toString()
            val loc = edloc.text.toString()
            val mob = edmob.text.toString()
            tv1.text = "$name $loc $mob"
        }
        gobtn.setOnClickListener {
            //val name = edname.text.toString()
            //val loc = edloc.text.toString()
            //val mob = edmob.text.toString()

            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("myName", edname.text.toString())
            intent.putExtra("myLoc", edloc.text.toString())
            intent.putExtra("myMob", edmob.text.toString())

            startActivity(intent)

        }
    }
}