package com.example.countByClicking

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val button = findViewById<Button>(R.id.button)
        val myTextView = findViewById<TextView>(R.id.text)
        var timesClicked = 0
        // set on-click listener
        button.setOnClickListener {
            timesClicked += 1
            myTextView.text = timesClicked.toString()
        }
    }
}