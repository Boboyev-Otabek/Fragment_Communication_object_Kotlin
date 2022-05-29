package com.example.fragmentcommunicationuserkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    fun initView(){
        var b_open=findViewById<Button>(R.id.b_open)
        b_open.setOnClickListener{
            openRuntimeActivity()
        }
    }
    fun openRuntimeActivity(){
        var intent=Intent(this,RuntimeActivity::class.java)
        startActivity(intent)
    }
}