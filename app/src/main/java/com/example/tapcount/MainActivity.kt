package com.example.tapcount

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tapButton = findViewById<Button>(R.id.tap_btn)
        val tapCount = findViewById<TextView>(R.id.text1)
        val totalCounter = findViewById<TextView>(R.id.text2)
        var counter = 0
        var malCounter = 0

            tapButton.setOnClickListener {

                if (counter <= 106){
                    counter += 1
                    tapCount.text = counter.toString()

                }
                else{
                    tapCount.text = "108"
                    malCounter += 1
                    totalCounter.text = malCounter.toString()
                    counter = 0
                }
//                Toast.makeText(this,"Button Pressed", Toast.LENGTH_SHORT).show()
            }

    }
}