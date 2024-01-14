package com.example.stafflinkmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val button: Button = findViewById(R.id.RegisterButton)
        button.setOnClickListener {
            setContentView(R.layout.activity_dashboard)
        }
        val loginButton: TextView = findViewById(R.id.goToLogin)
        loginButton.setOnClickListener {
            setContentView(R.layout.activity_login)
        }
    }

}