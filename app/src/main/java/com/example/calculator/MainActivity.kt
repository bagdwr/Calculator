package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var calcResult:Float=0f
    private var firstNumber=0f
    private var secondNumber=0f
    private lateinit var operationType:OperationType

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

        tv.text="0"

        bt0.setOnClickListener{
            if (!tv.text.equals("0")){
                tv.text=tv.text.toString()+"0"
            }
        }
        bt1.setOnClickListener{
            if (!tv.text.equals("0")){
                tv.text=tv.text.toString()+"1"
            }else{
                tv.text="1"
            }
        }
        bt2.setOnClickListener{
            if (!tv.text.equals("0")){
                tv.text=tv.text.toString()+"2"
            }
            else{
                tv.text="2"
            }
        }
        bt3.setOnClickListener{
            if (!tv.text.equals("0")){
                tv.text=tv.text.toString()+"3"
            }
            else{
                tv.text="3"
            }
        }
        bt4.setOnClickListener{
            if (!tv.text.equals("0")){
                tv.text=tv.text.toString()+"4"
            }else{
                tv.text="4"
            }
        }
        bt5.setOnClickListener{
            if (!tv.text.equals("0")){
                tv.text=tv.text.toString()+"5"
            }else{
                tv.text="5"
            }
        }
        bt6.setOnClickListener{
            if (!tv.text.equals("0")){
                tv.text=tv.text.toString()+"6"
            }else{
                tv.text="6"
            }
        }
        bt7.setOnClickListener{
            if (!tv.text.equals("0")){
                tv.text=tv.text.toString()+"7"
            }else{
                tv.text="7"
            }
        }
        bt8.setOnClickListener{
            if (!tv.text.equals("0")){
                tv.text=tv.text.toString()+"8"
            }else{
                tv.text="8"
            }
        }
        bt9.setOnClickListener{
            if (!tv.text.equals("0")){
                tv.text=tv.text.toString()+"9"
            }else{
                tv.text="9"
            }
        }

        btCancel.setOnClickListener {
            tv.text="0"
        }

        btDivide.setOnClickListener {
            operationType=OperationType.Divide
            firstNumber=tv.text.toString().toFloat()
            tv.text="0"
        }

        btMultiply.setOnClickListener {
            operationType=OperationType.Multiply
            firstNumber=tv.text.toString().toFloat()
            tv.text="0"
        }

        btPlus.setOnClickListener {
            operationType=OperationType.Add
            firstNumber=tv.text.toString().toFloat()
            tv.text="0"
        }

        btMinus.setOnClickListener {
            operationType=OperationType.Subtract
            firstNumber=tv.text.toString().toFloat()
            tv.text="0"
        }

        btResult.setOnClickListener {
            secondNumber=tv.text.toString().toFloat()
            calculate(operationType)
            tv.text=calcResult.toString()
        }
    }

    fun calculate(oType: OperationType){

        if (oType.equals(OperationType.Add)){
            calcResult=firstNumber+secondNumber
        }
        if (oType.equals(OperationType.Subtract)){
            calcResult=firstNumber-secondNumber
        }
        if (oType.equals(OperationType.Multiply)){
            calcResult=firstNumber*secondNumber
        }
        if (oType.equals(OperationType.Divide)){
            calcResult=firstNumber/secondNumber
        }
    }
}