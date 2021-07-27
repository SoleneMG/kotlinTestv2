package com.example.kotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var number1: EditText
    lateinit var number2: EditText
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        number1 = findViewById(R.id.number1)
        number2 = findViewById(R.id.number2)
        result = findViewById(R.id.result)
    }

    fun onClickoperator(view: View?) {
        if (number1 != null && number2 != null) {
            val number1Int: Int = Integer.parseInt(number1.text.toString())
            val number2Int: Int = Integer.parseInt(number2.text.toString())
            var button: Button = view as Button
            if (button.id == R.id.add_button)
                result.text = add(number1Int, number2Int).toString()
            else
                result.text = substraction(number1Int, number2Int).toString()
        }
    }

    fun add(number1: Int, number2: Int) = number1 + number2

    fun substraction(number1: Int, number2: Int) = number1 - number2
}