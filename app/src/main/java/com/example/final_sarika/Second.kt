package com.example.final_sarika

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.Button

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val userChoice = intent.getStringExtra(AlarmClock.EXTRA_MESSAGE)
    }


    fun sendMessageRock(view: View) {
        val editText = findViewById<Button>(R.id.button_rock)
        val message = editText.text.toString()
        val intent = Intent(this, third::class.java).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }


    fun sendMessagePaper(view: View) {
        val editText = findViewById<Button>(R.id.button_paper)
        val message = editText.text.toString()
        val intent = Intent(this, third::class.java).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    fun sendMessageScissors(view: View) {
        val editText = findViewById<Button>(R.id.button_scissor)
        val message = editText.text.toString()
        val intent = Intent(this, third::class.java).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}