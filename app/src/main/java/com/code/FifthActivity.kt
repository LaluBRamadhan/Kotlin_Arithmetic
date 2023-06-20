package com.code

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FifthActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
        val textFieldDivOne = findViewById<EditText>(R.id.numDivOne)
        val textFieldDivTwo = findViewById<EditText>(R.id.numDivTwo)
        val hasilBagi = findViewById<TextView>(R.id.hasilDiv)
        val buttonBagi = findViewById<Button>(R.id.buttonDivSubmit)

        buttonBagi.setOnClickListener{
            val inputTextOne = textFieldDivOne.text.toString()
            val inputTextTwo = textFieldDivTwo.text.toString()

            val numberOne:Float = (inputTextOne.toFloatOrNull() ?: 0) as Float
            val numberTwo:Float = (inputTextTwo.toFloatOrNull() ?: 0) as Float

            val result = numberOne / numberTwo
            val hasil = "Hasil: $result"

            hasilBagi.text = hasil
        }
    }
}