package com.example.assignmentp1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtResults = findViewById<TextView>(R.id.txtResults)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null){
                val results = when (age) {
                    in 20..25 -> "Christina Grimme"
                    in 26..35 -> "Bob Marley"
                    in 35..45 -> "John Belushi"
                    in 46..55 -> "Michael Jackson"
                    in 56..67 -> "Shelly Duval"
                    in 68..78 -> "Mahatma Gandhi"
                    in 79..85 -> "Queen Victoria"
                    in 86..90 -> "Hellen Keller"
                    in 91..95 -> "Harriet Tubman"
                    in 96..100 -> "Tony Bennett"
                    else -> "Senior"
                }
                txtResults.text ="Age: $age\n${
                    when (results) {
                        "Christina Grimme" -> "Christina Grimme died at the age of 9 ."
                        "Bob Marley" -> "Bob Marley died at the age of 15."
                        "John Belushi" -> "John Belushi died at the age of 30."
                        "Michael Jackson" -> "Michael Jackson died at the age of 60."
                        "Shelly Duval" -> "Shelly Duval died at the age of 75."
                        "Mahatma Gandhi" -> "Mahatma Gandhi died at the age of 78."
                        "Queen Victoria" -> "Queen Victoria died at th age of 81."
                        "Hellen Keller" -> "Hellen Keller died at the age of 87."
                        "Harriet Tubman" -> "Harriet Tubman died at the age of 93."
                        "Tony Bennett" -> "Tony Bennett died at the age of 96."
                        else -> "Please enter the age between the age of 20 and 100."
                    }
                }"
            } else {
                txtResults.text = "Please enter valid age."
            }
        }
        btnClear.setOnClickListener {
            ageNumber.text.clear()
        }
    }
}