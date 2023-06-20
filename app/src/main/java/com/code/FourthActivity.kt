package com.code

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class FourthActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val textFieldMulOne = findViewById<EditText>(R.id.numMulOne)
        val textFieldMulTwo = findViewById<EditText>(R.id.numMulTwo)
        val hasilKali = findViewById<TextView>(R.id.hasilMul)
        val buttonMul = findViewById<Button>(R.id.buttonMulSubmit)

        buttonMul.setOnClickListener{
            val inputTextOne = textFieldMulOne.text.toString()
            val inputTextTwo = textFieldMulTwo.text.toString()

            val numberOne = inputTextOne.toIntOrNull() ?: 0
            val numberTwo = inputTextTwo.toIntOrNull() ?: 0

            val result = numberOne * numberTwo
            val hasil = "Hasil: $result"

            hasilKali.text = hasil
        }
    }
}