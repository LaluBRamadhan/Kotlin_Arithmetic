package com.code

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textFieldAddOne = findViewById<EditText>(R.id.numAddOne)
        val textFieldAddTwo = findViewById<EditText>(R.id.numAddTwo)
        val hasilTambah = findViewById<TextView>(R.id.hasilAdd)
        val buttonAdd = findViewById<Button>(R.id.buttonAddSubmit)

        buttonAdd.setOnClickListener{
            val inputTextOne = textFieldAddOne.text.toString()
            val inputTextTwo = textFieldAddTwo.text.toString()

            val numberOne = inputTextOne.toIntOrNull() ?: 0
            val numberTwo = inputTextTwo.toIntOrNull() ?: 0

            val result = numberOne + numberTwo
            val hasil = "Hasil: $result"

            hasilTambah.text = hasil
        }
    }
}