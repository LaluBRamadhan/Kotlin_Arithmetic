package com.code

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val textFieldSubOne = findViewById<EditText>(R.id.numSubOne)
        val textFieldSubTwo = findViewById<EditText>(R.id.numSubTwo)
        val hasilKurang = findViewById<TextView>(R.id.hasilSub)
        val buttonSub = findViewById<Button>(R.id.buttonSubSubmit)

        buttonSub.setOnClickListener{
            val inputTextOne = textFieldSubOne.text.toString()
            val inputTextTwo = textFieldSubTwo.text.toString()

            val numberOne = inputTextOne.toIntOrNull() ?: 0
            val numberTwo = inputTextTwo.toIntOrNull() ?: 0

            val result = numberOne - numberTwo
            val hasil = "Hasil: $result"

            hasilKurang.text = hasil
        }

    }
}