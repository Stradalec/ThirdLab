package com.example.thirdlab

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val firstHorizontal: TextView = findViewById(R.id.firstHorizontalView)
        val secondHorizontal: TextView = findViewById(R.id.secondHorizontalView)
        val thirdHorizontal: TextView = findViewById(R.id.thirdHorizontalView)
        val firstVertical: TextView = findViewById(R.id.firstVerticalView)
        val secondVertical: TextView = findViewById(R.id.secondVerticalView)
        val thirdVertical: TextView = findViewById(R.id.thirdVerticalView)
        val firstConstrant: TextView = findViewById(R.id.firstConstrantView)
        val secondConstrant: TextView = findViewById(R.id.secondConstrantView)
        val thirdConstrant: TextView = findViewById(R.id.thirdConstrantView)
        val lonelyButton: Button = findViewById(R.id.button)
        var currentValue = 1;
        var remainder = 0;

        lonelyButton.setOnClickListener{
            ++currentValue
            remainder = currentValue % 3;
            if (remainder == 1) {
                firstHorizontal.setText(currentValue.toString())
                secondHorizontal.setText(" ")
                thirdHorizontal.setText(" ")
                firstVertical.setText(currentValue.toString())
                secondVertical.setText(" ")
                thirdVertical.setText(" ")
                firstConstrant.setText(currentValue.toString())
                secondConstrant.setText(" ")
                thirdConstrant.setText(" ")
            }
            else if (remainder == 2) {
                firstHorizontal.setText("")
                secondHorizontal.setText(currentValue.toString())
                thirdHorizontal.setText(" ")
                firstVertical.setText(" ")
                secondVertical.setText(currentValue.toString())
                thirdVertical.setText(" ")
                firstConstrant.setText(" ")
                secondConstrant.setText(currentValue.toString())
                thirdConstrant.setText(" ")
            }
            else {
                firstHorizontal.setText("")
                secondHorizontal.setText(" ")
                thirdHorizontal.setText(currentValue.toString())
                firstVertical.setText(" ")
                secondVertical.setText(" ")
                thirdVertical.setText(currentValue.toString())
                firstConstrant.setText(" ")
                secondConstrant.setText(" ")
                thirdConstrant.setText(currentValue.toString())
            }
        }
    }
}