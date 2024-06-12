package com.example.relativelayoutiii

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)

        findViewById<Button>(R.id.buttonAdd).setOnClickListener {
            value += 2
            textView.text = value.toString()
        }

        findViewById<Button>(R.id.buttonSubtract).setOnClickListener {
            value -= 2
            textView.text = value.toString()
        }

        findViewById<Button>(R.id.buttonMultiply).setOnClickListener {
            value *= 2
            textView.text = value.toString()
        }

        findViewById<Button>(R.id.buttonDivide).setOnClickListener {
            if (value != 0) {
                value /= 2
                textView.text = value.toString()
            }
        }
    }
}
