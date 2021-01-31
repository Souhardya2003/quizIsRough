package com.example.quizrough

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class quiz_question_1 : AppCompatActivity() {

    private lateinit var button1: Button
    private lateinit var quiz1Options: RadioGroup
    private lateinit var mHandler: Handler
    private lateinit var mRunnable: Runnable
    lateinit var timer1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question_1)

        button1 = findViewById(R.id.button1)
        quiz1Options = findViewById(R.id.quiz_1_option)

        startMainActivity()
        button1.setOnClickListener{
            var id: Int = quiz1Options.checkedRadioButtonId
            if (id != -1){
                val radio: RadioButton = findViewById(id)
                if (id == R.id.option_1) {
                    Toast.makeText(applicationContext, "Correct", Toast.LENGTH_SHORT).show()
                }
                else {Toast.makeText(applicationContext, "Wrong", Toast.LENGTH_SHORT).show()}
            }
            else{
                Toast.makeText(applicationContext, "Nothing", Toast.LENGTH_SHORT).show()
            }
            val intent2 = Intent(this, quiz_question_2::class.java)
            startActivity(intent2)

        }
    }
    private fun startMainActivity(){
        mRunnable = Runnable { startActivity(Intent(this, quiz_question_2::class.java))
            finish()
        }
        mHandler = Handler()
        mHandler.postDelayed(mRunnable,7000)
    }

    override fun onStop() {
        super.onStop()
        mHandler.removeCallbacks(mRunnable)
    }

    }