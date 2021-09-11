package com.example.firststartandroidstudio

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvText01: TextView
    private lateinit var btn01: Button
    private lateinit var btnClean: Button
    private lateinit var btnToActivity02: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "it's Main Activity"

        // Button "Click me!"
        btn01 = findViewById(R.id.btn01)
        btn01.setOnClickListener {
            tvText01.setTypeface(null, Typeface.BOLD)
            tvText01.setTextColor(Color.parseColor("#000000"))
            tvText01.text = "Btn01 clicked!"
        }

        // Button "Clean"
        tvText01 = findViewById(R.id.tvText01)
        btnClean = findViewById(R.id.btnClean)
        btnClean.setOnClickListener {
            tvText01.setTypeface(null, Typeface.BOLD_ITALIC)
            tvText01.setTextColor(Color.parseColor("#FF0000"))
            tvText01.text = "Hello Kotlin!*"
        }

        // переход на другой Активити
        btnToActivity02 = findViewById(R.id.btnToActivity02)
        btnToActivity02.setOnClickListener {
            val intent = Intent(this, Activity02::class.java)
            startActivity(intent)
        }
    }

}