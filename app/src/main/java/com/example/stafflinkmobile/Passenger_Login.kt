package com.example.stafflinkmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Passenger_Login : AppCompatActivity() {

    lateinit var Login_button: Button
    lateinit var Register_button: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passenger_login)

        Login_button = findViewById(R.id.LoginButton)
        Login_button.setOnClickListener {
//            setContentView(R.layout.activity_dashboard)
            val intent1 = Intent(this, Dashboard::class.java)
            startActivity(intent1)
        }


        Register_button= findViewById(R.id.goToRegister)
        Register_button.setOnClickListener {
//            setContentView(R.layout.activity_register)
            val intent2 = Intent(this, Passenger_Register::class.java)
            startActivity(intent2)
        }
    }
}