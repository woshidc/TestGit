package com.example.testgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview.text="${num}"
        button.setOnClickListener {
            textview.text="${++num}"
        }

        button2.setOnClickListener {
            textview.text="${--num}"
        }

    }
}