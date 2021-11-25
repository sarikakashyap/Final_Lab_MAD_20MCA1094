package com.example.final_sarika

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.ImageView
import android.widget.TextView

class third : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val userChoice = intent.getStringExtra(AlarmClock.EXTRA_MESSAGE)
        //val userImage = findViewById<ImageView>(R.id.imageView)
        val userImageP=findViewById<TextView>(R.id.Player)
        val userImageC=findViewById<TextView>(R.id.computer)
        //var imgResId = R.drawable.rock
      var choice: String
        var choice2: String

        when(userChoice){
            "Rock" -> choice = "Rock"
            "Paper" -> choice = "Paper"
            "Scissors" -> choice = "Scissor"
            else -> choice = "Rock"
        }
        userImageP.apply { text=choice }
        //userImage.setImageResource(imgResId)


        fun generateChoice(): String {
            val list = (0..2)
            val choice = list.shuffled().take(1)[0]
            val rps = arrayOf("Rock", "Paper", "Scissors")
            return rps.elementAtOrElse(choice) { index -> "The value for index $index is undefined" }
        }

        val compChoice = generateChoice()
       // val compImage = findViewById<ImageView>(R.id.imageView4)
        var imgResId2 = R.drawable.rock

        //When compChoice == "Rock", "Paper", or "Scissors". Else statement needed
        when(compChoice){
            "Rock" -> choice2 ="Rock"
            "Paper" -> choice2 ="Paper"
            "Scissors" -> choice2 ="Scissor"
            else -> choice2 ="Rock"
        }
        userImageC.apply { text=choice2 }
      //  compImage.setImageResource(imgResId2)


        var display: String




        //When true. This replaces nested if and else if statements.
        when{
            (userChoice == "Rock"  && compChoice == "Paper") -> display = "You Lose!"
            (userChoice == "Paper"  && compChoice == "Scissors")  -> display = "You Lose!"
            (userChoice == "Scissors"  && compChoice == "Rock") -> display = "You Lose!"
            (userChoice == compChoice ) -> display = "Draw!"
            else -> display = "You Win!"
        }

        //Place the value of display in the TextView
        findViewById<TextView>(R.id.textView5).apply {
            text = display

        }
    }
}