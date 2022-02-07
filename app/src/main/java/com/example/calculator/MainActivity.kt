package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv=findViewById<TextView>(R.id.textView);
        val bt1=findViewById<Button>(R.id.bt1)
        val bt2=findViewById<Button>(R.id.bt2)
        val bt3=findViewById<Button>(R.id.bt3)
        val bt4=findViewById<Button>(R.id.bt4)
        val bt5=findViewById<Button>(R.id.bt5)
        val bt6=findViewById<Button>(R.id.bt6)
        val bt7=findViewById<Button>(R.id.bt7)
        val bt8=findViewById<Button>(R.id.bt8)
        val bt9=findViewById<Button>(R.id.bt9)
        val bt0=findViewById<Button>(R.id.bt0)
        val btCancel=findViewById<Button>(R.id.btCancel)
        val btPlus=findViewById<Button>(R.id.btPlus)
        val btMinus=findViewById<Button>(R.id.btMin)
        val btMultiply=findViewById<Button>(R.id.btMulty)
        val btDivide=findViewById<Button>(R.id.btDiv)
        val btResult=findViewById<Button>(R.id.btEq)
        
    }
}