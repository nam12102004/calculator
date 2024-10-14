package com.example.myapplication00


import android.os.Bundle

import android.view.View
import android.widget.Button

import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var textResult: TextView



    var op: Int = 0
    var sum : String = ""

    var op3 : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textResult = findViewById(R.id.display)

        findViewById<Button>(R.id.button_zero).setOnClickListener(this)
        findViewById<Button>(R.id.button_1).setOnClickListener(this)
        findViewById<Button>(R.id.button_2).setOnClickListener(this)
        findViewById<Button>(R.id.button_3).setOnClickListener(this)
        findViewById<Button>(R.id.button_4).setOnClickListener(this)
        findViewById<Button>(R.id.button_5).setOnClickListener(this)
        findViewById<Button>(R.id.button_6).setOnClickListener(this)
        findViewById<Button>(R.id.button_7).setOnClickListener(this)
        findViewById<Button>(R.id.button_8).setOnClickListener(this)
        findViewById<Button>(R.id.button_9).setOnClickListener(this)
        findViewById<Button>(R.id.button_CE).setOnClickListener(this)
        findViewById<Button>(R.id.button_C).setOnClickListener(this)
        findViewById<Button>(R.id.button_BS).setOnClickListener(this)
        findViewById<Button>(R.id.button_divide).setOnClickListener(this)
        findViewById<Button>(R.id.button_subtract).setOnClickListener(this)
        findViewById<Button>(R.id.button_add).setOnClickListener(this)
        findViewById<Button>(R.id.button_plusminor).setOnClickListener(this)
        findViewById<Button>(R.id.button_multiply).setOnClickListener(this)
        findViewById<Button>(R.id.button_cham).setOnClickListener(this)
        findViewById<Button>(R.id.button_equal).setOnClickListener(this)

        findViewById<Button>(R.id.button_C).setOnClickListener(this)
        findViewById<Button>(R.id.button_CE).setOnClickListener(this)
        findViewById<Button>(R.id.button_BS).setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        val id = p0?.id

        if (id == R.id.button_zero) {


            if ( op == 0 || op == 3){

                textResult.text = "0"
                op3 = "0"
            }
            else {  op3 += '0'
                val newValue = "0"
                textResult.text = "${textResult.text}$newValue"}
            op=1
        } else if (id == R.id.button_1) {


            if ( op == 0 || op == 3){

                textResult.text = "1"
                op3 = "1"
            }
            else {   op3 += '1'
                val newValue = "1"
                textResult.text = "${textResult.text}$newValue"}
            op=1
        } else if (id == R.id.button_2) {


            if ( op == 0 || op == 3 ){

                textResult.text = "2"
                op3 = "2"
            }
            else {    op3 += '2'
                val newValue = "2"
                textResult.text = "${textResult.text}$newValue"}
op =1
        } else if (id == R.id.button_3) {


            if ( op == 0 || op == 3 ){

                textResult.text = "3"
                op3 = "3"
            }
            else { op3 += '3'
                val newValue = "3"
                textResult.text = "${textResult.text}$newValue"}
            op=1

        } else if (id == R.id.button_4) {


            if ( op == 0 || op == 3 ){

                textResult.text = "4"
                op3 = "4"
            }
            else {    op3 += '4'
                val newValue = "4"
                textResult.text = "${textResult.text}$newValue"}
            op=1
        } else if (id == R.id.button_5) {

            if ( op == 0 || op == 3 ){

                textResult.text = "5"
                op3 = "5"
            }
            else {    op3 += '5'
                val newValue = "5"
                textResult.text = "${textResult.text}$newValue"}
            op=1
        } else if (id == R.id.button_6) {

            if ( op == 0  || op == 3 ){

                textResult.text = "6"
                op3 = "6"
            }
            else { op3 += '6'
                val newValue = "6"
                textResult.text = "${textResult.text}$newValue"}
            op=1
        } else if (id == R.id.button_7) {

            if ( op == 0  || op == 3 ){

                textResult.text = "7"
                op3 = "7"
            }
            else {     op3 += '7'
                val newValue = "7"
                textResult.text = "${textResult.text}$newValue"}
            op=1
        } else if (id == R.id.button_8) {

            if ( op == 0  || op == 3 ){

                textResult.text = "8"
                op3 = "8"
            }
            else { op3 += '8'
                val newValue = "8"
                textResult.text = "${textResult.text}$newValue"}
            op=1
        } else if (id == R.id.button_9) {

            if ( op == 0  || op == 3 ){

                textResult.text = "9"
                op3 = "9"
            }
            else {   op3 += '9'
                val newValue = "9"
                textResult.text = "${textResult.text}$newValue"}
            op=1
        } else if (id == R.id.button_add) {
            if (op==1){
            op3 += " + "
            textResult.text = op3
                op=2
            }
            if (op == 3){
                op3 = sum + " + "
                textResult.text = op3
                op = 2
            }

        } else if (id == R.id.button_multiply) {
            if (op==1){
            op3 += " x "

                textResult.text = op3
                op=2
            }
                if (op == 3){
                    op3 = sum + " x "
                    textResult.text = op3
                    op =2
                }


        } else if (id == R.id.button_subtract) {
            if (op==1){
            op3 += " - "
            textResult.text = op3
                op=2
            }
                if (op == 3){
                    op3 = sum + " - "
                    textResult.text = op3
                    op=2
                }


        } else if (id == R.id.button_cham) {

            if (op == 1)   {
                op3 += "."
                val newValue = "."
                textResult.text = "${textResult.text}$newValue"
            }
        } else if (id == R.id.button_divide) {
            if (op==1){
            op3 += " / "
            textResult.text = op3
            op =2}
                if (op == 3){
                    op3 = sum + " / "
                    textResult.text = op3
                    op = 2
                }


        } else if (id == R.id.button_plusminor) {
            if (op == 2 || op == 0){
                op3 += "-"
            textResult.text = op3}
op=1
        } else if (id == R.id.button_equal) {
            if (op==1){
            sum = calculate(op3)
            textResult.text = "${textResult.text}\n" + sum
            op=1
            op3 = "$sum"
            op = 3}
        }
        else if (id == R.id.button_C) {
            textResult.text = "0"
            op3 = ""
            op=0
        }
        else if (id == R.id.button_BS) {
            if (op == 1) op3 = op3.dropLast(1)
            if (op == 2) op3 = op3.dropLast(3)
            textResult.text = op3
            if (op3 == "" || op3.length == 1) {
                textResult.text = "0"
                op = 0
            }
            else if (op3[op3.length-1] == ' ') op = 2;
            else op = 1;
        }
        else if (id == R.id.button_CE) {
          op3 = deleteChar(op3)
           textResult.text = op3
            if (op3 == "") op =1
            else{
                if (op == 2) op =1
              else op =2
            }
        }




    }




    fun calculate(expression: String): String {

        val tokens = expression.split(" ").filter { it.isNotEmpty() }


        if (tokens.isEmpty()) {
            throw IllegalArgumentException("Biểu thức không hợp lệ")
        }


        var result = tokens[0].toDouble()


        var index = 1
        while (index < tokens.size) {
            val operator = tokens[index]
            val value = tokens[index + 1].toDouble()


            when (operator) {
                "+" -> result += value
                "-" -> result -= value
                "x" -> result *= value
                "/" -> if (value != 0.0) {
                    result /= value
                } else {
                    throw ArithmeticException("Không thể chia cho 0")
                }
                else -> throw IllegalArgumentException("Toán tử không hợp lệ: $operator")
            }
            index += 2
        }

        return if (result % 1.0 == 0.0) {
            result.toInt().toString()
        } else {
            result.toString()
        }

    }
    fun deleteChar(expression: String): String {
        var result : String = expression
        var lastChar : Char = result[expression.length-1]

        if (lastChar == ' ') result = expression.dropLast(3)
        if (result.length == 1) result = "0"
        else {
            while (lastChar != ' '){
                if (result.length == 1) {
                    result = "0"
                    break
                }

               result = result.dropLast(1)
                lastChar = result[result.length-1]

            }
        }




        return result
    }


}
