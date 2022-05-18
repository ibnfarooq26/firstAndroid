package com.example.firstandroid

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button= findViewById(R.id.button3)
        val dice=Dice(6)

        rollButton.setOnClickListener{
            val resultImageView: ImageView = findViewById(R.id.imageView)
            val randomNum = dice.rollDice()
            when (randomNum){
                1-> resultImageView.setImageResource(R.drawable.dice_1)
                2-> resultImageView.setImageResource(R.drawable.dice_2)
                3-> resultImageView.setImageResource(R.drawable.dice_3)
                4-> resultImageView.setImageResource(R.drawable.dice_4)
                5-> resultImageView.setImageResource(R.drawable.dice_5)
                6-> resultImageView.setImageResource(R.drawable.dice_6)
            }


        }
    }
    class Dice (val numSides:Int){
        fun rollDice():Int {
            return (1..numSides).random()
        }
    }
}