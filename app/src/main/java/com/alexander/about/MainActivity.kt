package com.alexander.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView

class MainActivity : AppCompatActivity(){
    lateinit var txv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
        txv.text = "我是黃植達"
        txv.setOnClickListener({
            if (txv.text == "黃植達你好"){
                txv.text = "海青班很棒,數媒更是好的方向"
            }
            else {
                txv.text = "黃植達你好"
            }
        })
    }
}