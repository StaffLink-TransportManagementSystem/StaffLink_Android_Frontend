package com.example.stafflinkmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Register : AppCompatActivity() {

    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        button = findViewById(R.id.RegisterButton)
        button.setOnClickListener {
//            setContentView(R.layout.activity_dashboard)
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }
        val loginButton: TextView = findViewById(R.id.goToLogin)
        loginButton.setOnClickListener {
//            setContentView(R.layout.activity_login)
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }

}