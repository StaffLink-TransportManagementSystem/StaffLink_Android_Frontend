package com.example.stafflinkmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Passenger_Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passenger_register)

        var register_button : Button = findViewById(R.id.registerButton)
        register_button.setOnClickListener {
            var register_Intent = Intent(this, Passenger_Dashboard::class.java)
            startActivity(register_Intent)
        }

        var login_button : TextView = findViewById(R.id.goToLogin)
        login_button.setOnClickListener {
            var login_Intent = Intent(this, Passenger_Login::class.java)
            startActivity(login_Intent)
        }
    }
}