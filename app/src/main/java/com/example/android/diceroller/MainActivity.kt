package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countUpButton: Button = findViewById(R.id.countUp_button)


        rollButton.setOnClickListener { rollDice() }
        countUpButton.setOnClickListener { countUp() }
    }

    private fun countUp(){
        var text: String = result_text.text.toString()
        if(text == getString(R.string.hello_world)){
            result_text.setText("1")
        } else {
            var numberNow: Int = text.toInt()
            if (numberNow < 6)
                numberNow+=1
            result_text.text = numberNow.toString()
        }
    }

    private fun rollDice(){

        val randomInt = (1..6).random()
        val resultText : TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }
}