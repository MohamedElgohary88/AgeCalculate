package com.example.agecalculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buGetAge:Button = findViewById(R.id.buGetAge)
        val showAge:TextView = findViewById(R.id.showAge)
        val etYearBirth:EditText = findViewById(R.id.etYearBirth)
        buGetAge.setOnClickListener  {
            val yearofbirth:Int = etYearBirth.text.toString().toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val age = (currentYear.minus(yearofbirth)).toString()
            showAge.setText(" Your Age is : $age Year ")
        }
    }
}