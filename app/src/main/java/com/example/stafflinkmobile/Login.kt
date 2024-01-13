package com.example.stafflinkmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button: Button = findViewById(R.id.LoginButton)
        button.setOnClickListener {
            setContentView(R.layout.activity_dashboard)
        }


        val registerButton: TextView = findViewById(R.id.goToRegister)
        registerButton.setOnClickListener {
            setContentView(R.layout.activity_register)
        }
    }


}