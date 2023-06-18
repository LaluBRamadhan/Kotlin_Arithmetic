package com.code

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonTambah = findViewById<Button>(R.id.buttonOne)
        val buttonKurang = findViewById<Button>(R.id.buttonSecond)
        val buttonKali = findViewById<Button>(R.id.buttonThird)
        val buttonBagi = findViewById<Button>(R.id.buttonFourth)

        buttonTambah.setOnClickListener{
            val intentSatu = Intent(this, SecondActivity::class.java)
            startActivity(intentSatu)
        }

        buttonKurang.setOnClickListener{
            val intentDua = Intent(this, ThirdActivity::class.java)
            startActivity(intentDua)
        }

        buttonKali.setOnClickListener{
            val intentTiga = Intent(this, FourthActivity::class.java)
            startActivity(intentTiga)
        }

        buttonBagi.setOnClickListener{
            val intentEmpat = Intent(this, FifthActivity::class.java)
            startActivity(intentEmpat)
        }
    }
}