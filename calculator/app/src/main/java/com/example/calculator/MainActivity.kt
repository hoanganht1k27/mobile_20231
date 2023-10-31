package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var operatorBtn = ""
    var variableA = 0.0;
    var variableB = 0.0;
    var viewNumber = "";
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.textView)
        var btnCE = findViewById<Button>(R.id.BtnCE);
        btnCE.setOnClickListener{
            textView.setText("0")
        }


        var btnC = findViewById<Button>(R.id.BtnC)
        btnC.setOnClickListener{
            operatorBtn = ""
        }

        var btnBS = findViewById<Button>(R.id.BtnBS)
        btnBS.setOnClickListener{
            var str = textView.text.toString()

            if(str.length == 1){
                textView.text = "0"
            }else{
                var newstr = str.substring(0,str.length-1)
                textView.text = newstr
            }
        }

        var divBtn = findViewById<Button>(R.id.BtnDiv);
        divBtn.setOnClickListener{
            variableA = textView.text.toString().toDouble()
            operatorBtn = "/"
            textView.text = "/"
            variableB = 0.0
        }

        var mulBtn = findViewById<Button>(R.id.BtnMul);
        mulBtn.setOnClickListener{
            variableA = textView.text.toString().toDouble()
            operatorBtn = "*"
            textView.text = "*"
            variableB = 0.0
        }

        var addBtn = findViewById<Button>(R.id.BtnAdd);
        addBtn.setOnClickListener{
            variableA = textView.text.toString().toDouble()
            operatorBtn = "+"
            textView.text = "+"
            variableB = 0.0
        }

        var subBtn = findViewById<Button>(R.id.BtnSub)
        subBtn.setOnClickListener{
            variableA = textView.text.toString().toDouble()
            operatorBtn = "-"
            textView.text = "-"
            variableB = 0.0
        }

        var resultBtn = findViewById<Button>(R.id.BtnRes)
        resultBtn.setOnClickListener {
            when(operatorBtn){
                "+" -> {
                    variableB = textView.text.toString().toDouble()
                    variableA += variableB
                    textView.text = String.format("%.2f",variableA).toDouble().toString()
                }
                "-" -> {
                    variableB = textView.text.toString().toDouble()
                    variableA -= variableB
                    textView.text = String.format("%.2f",variableA).toDouble().toString()
                }
                "*" -> {
                    variableB = textView.text.toString().toDouble()
                    variableA *= variableB
                    textView.text = String.format("%.2f",variableA).toDouble().toString()
                }
                "/" -> {
                    variableB = textView.text.toString().toDouble()
                    variableA /= variableB
                    textView.text = String.format("%.2f",variableA).toDouble().toString()
                }
                "" -> {
                    textView.text = "0"
                    variableA = 0.0
                }
            }
        }
        var btnFlo = findViewById<Button>(R.id.BtnFlo)
        btnFlo.setOnClickListener {
            var str = textView.text.toString()
            if(str != "*" && str != "/" && str != "+" && str != "-"){
                str += "."
                textView.text = str
            }
        }
        var btn0 = findViewById<Button>(R.id.Btn0)
        btn0.setOnClickListener {
            var str = textView.text.toString()
            if(str != "0"){
                str += "0"
                textView.text = str
            }
        }
        var btn1 = findViewById<Button>(R.id.Btn1)
        btn1.setOnClickListener {
            var str = textView.text.toString()
            if(str == "0" || str == "*" || str == "/" || str == "+" || str == "-"){
                str = "1"
            }else {
                str += "1"
            }
            textView.text = str

        }
        var btn2 = findViewById<Button>(R.id.Btn2)
        btn2.setOnClickListener {
            var str = textView.text.toString()
            if(str == "0" || str == "*" || str == "/" || str == "+" || str == "-"){
                str = "2"
            }else {
                str += "2"
            }
            textView.text = str
        }
        var btn3 = findViewById<Button>(R.id.Btn3)
        btn3.setOnClickListener {
            var str = textView.text.toString()
            if(str == "0" || str == "*" || str == "/" || str == "+" || str == "-"){
                str = "3"
            }else {
                str += "3"
            }
            textView.text = str
        }
        var btn4 = findViewById<Button>(R.id.Btn4)
        btn4.setOnClickListener {
            var str = textView.text.toString()
            if(str == "0" || str == "*" || str == "/" || str == "+" || str == "-"){
                str = "4"
            }else {
                str += "4"
            }
            textView.text = str
        }
        var btn5 = findViewById<Button>(R.id.Btn5)
        btn5.setOnClickListener {
            var str = textView.text.toString()
            if(str == "0" || str == "*" || str == "/" || str == "+" || str == "-"){
                str = "5"
            }else {
                str += "5"
            }
            textView.text = str
        }
        var btn6 = findViewById<Button>(R.id.Btn6)
        btn6.setOnClickListener {
            var str = textView.text.toString()
            if(str == "0" || str == "*" || str == "/" || str == "+" || str == "-"){
                str = "6"
            }else {
                str += "6"
            }
            textView.text = str
        }
        var btn7 = findViewById<Button>(R.id.Btn7)
        btn7.setOnClickListener {
            var str = textView.text.toString()
            if(str == "0" || str == "*" || str == "/" || str == "+" || str == "-"){
                str = "7"
            }else {
                str += "7"
            }
            textView.text = str
        }
        var btn8 = findViewById<Button>(R.id.Btn8)
        btn8.setOnClickListener {
            var str = textView.text.toString()
            if(str == "0" || str == "*" || str == "/" || str == "+" || str == "-"){
                str = "8"
            }else {
                str += "8"
            }
            textView.text = str
        }
        var btn9 = findViewById<Button>(R.id.Btn9)
        btn9.setOnClickListener {
            var str = textView.text.toString()
            if(str == "0" || str == "*" || str == "/" || str == "+" || str == "-"){
                str = "9"
            }else {
                str += "9"
            }
            textView.text = str
        }
    }
}

