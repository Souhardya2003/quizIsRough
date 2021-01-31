package com.example.quizrough

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class quiz_question_2 : AppCompatActivity() {

    private lateinit var button2: Button
    private lateinit var quiz2Options: RadioGroup
    var score2  = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question_2)

//        val scoreOf1 = intent.getIntExtra("score1",0)

        button2 = findViewById(R.id.button2)
        quiz2Options = findViewById(R.id.quiz_2_option)

        quiz2Options.setOnCheckedChangeListener { group, checkedId ->

            if(checkedId == R.id.option_2_of_2){
                val toast3 = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT)
                toast3.show()
            }
            else{ val toast4 = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT)
                toast4.show()}
        }

        button2.setOnClickListener{
            val intent3 = Intent(this, score_page::class.java)
            startActivity(intent3)

        }
    }
}