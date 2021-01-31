package com.example.quizrough

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val startButton: Button

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton = findViewById(R.id.startButton)
        startButton.setOnClickListener {
            val intent = Intent(this, quiz_question_1::class.java)
            startActivity(intent)
        }
    }
}