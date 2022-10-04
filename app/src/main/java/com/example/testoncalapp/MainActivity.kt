package com.example.testoncalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_Display = findViewById<TextView>(R.id.tv_Input)
        val firstNumber = findViewById<EditText>(R.id.firsNum)
        val seconNumber = findViewById<EditText>(R.id.SecondNum)
        val AddNum = findViewById<Button>(R.id.btn_Addition)
        val MultiplyNum = findViewById<Button>(R.id.btn_Multilpy)
        val SubtractNum = findViewById<Button>(R.id.btn_Subtract)
        val DivisNum = findViewById<Button>(R.id.btn_Division)
        val ResetBtn = findViewById<Button>(R.id.btn_Reset)

        AddNum.setOnClickListener {
            if (firstNumber.text.toString().isEmpty()) {
                Toast.makeText(this, " Please enter the first number", Toast.LENGTH_SHORT).show()
            } else if (seconNumber.text.toString().isEmpty()) {
                Toast.makeText(this, " Please enter the second number", Toast.LENGTH_SHORT).show()
            } else {
                val x = firstNumber.text.toString().toInt()
                val y = seconNumber.text.toString().toInt()
                val res = x + y
                tv_Display.text = "The addition of both numbers is $res"
            }
        }

        MultiplyNum.setOnClickListener {
            if (firstNumber.text.toString().isEmpty()) {
                Toast.makeText(this, " Please enter the first number", Toast.LENGTH_SHORT).show()
            } else if (seconNumber.text.toString().isEmpty()) {
                Toast.makeText(this, " Please enter the second number", Toast.LENGTH_SHORT).show()
            } else {
                val x = firstNumber.text.toString().toInt()
                val y = seconNumber.text.toString().toInt()
                val res = x * y
                tv_Display.text = "The multiplication of both numbers is $res"
            }
        }

        SubtractNum.setOnClickListener {
            if (firstNumber.text.toString().isEmpty()) {
                Toast.makeText(this, " Please enter the first number", Toast.LENGTH_SHORT).show()
            } else if (seconNumber.text.toString().isEmpty()) {
                Toast.makeText(this, " Please enter the second number", Toast.LENGTH_SHORT).show()
            } else {
                val x = firstNumber.text.toString().toInt()
                val y = seconNumber.text.toString().toInt()
                val res = x - y
                tv_Display.text = "The subtraction of both numbers is $res"
            }

        }
        DivisNum.setOnClickListener {
            if (firstNumber.text.toString().isEmpty()) {
                Toast.makeText(this, " Please enter the first number", Toast.LENGTH_SHORT).show()
            } else if (seconNumber.text.toString().isEmpty()) {
                Toast.makeText(this, " Please enter the second number", Toast.LENGTH_SHORT).show()
            } else {
                val x = firstNumber.text.toString().toInt()
                val y = seconNumber.text.toString().toInt()
                val res = x / y
                tv_Display.text = "The division of both numbers is $res"
            }
        }

        ResetBtn.setOnClickListener {
            var tv_Input = tv_Display.text.toString()
            tv_Input == ""
            tv_Display.text = ""
        }
    }

}
