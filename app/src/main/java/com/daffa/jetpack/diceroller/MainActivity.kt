package com.daffa.jetpack.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val resultTextView : TextView = findViewById(R.id.textView)
        val dice = Dice(6)
        val diceRoll = dice.roll()
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSides:Int) {

    fun roll(): Int {
        return (1 .. numSides).random()
    }
}