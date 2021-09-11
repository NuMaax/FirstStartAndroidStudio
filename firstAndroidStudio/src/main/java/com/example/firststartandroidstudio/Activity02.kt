package com.example.firststartandroidstudio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Activity02 : AppCompatActivity() {

    private lateinit var btnToActivityMain: Button
    private lateinit var etValueForIf: EditText
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_02)
        title = "it's Activity 02"

        btnToActivityMain = findViewById(R.id.btnToActivityMain)

        btnToActivityMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        etValueForIf = findViewById(R.id.etValueForIf)
        tvResult = findViewById(R.id.tvResult)



    }
}