package com.example.firststartandroidstudio

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var tvText01: TextView
    lateinit var btn01: Button
    lateinit var btnClean: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvText01 = findViewById(R.id.tvText01)
        btn01 = findViewById(R.id.btn01)
        btnClean = findViewById(R.id.btnClean)

        btn01.setOnClickListener {
            tvText01.text = "Btn01 clicked!"
        }

        btnClean.setOnClickListener {
            tvText01.text = "Hello world!*"
        }
    }

}