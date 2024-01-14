package com.example.stafflinkmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStarted: Button = findViewById(R.id.button2)
        getStarted.setOnClickListener {
            setContentView(R.layout.activity_register  )
        }
    }
}