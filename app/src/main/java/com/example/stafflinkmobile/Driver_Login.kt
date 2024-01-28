package com.example.stafflinkmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Driver_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_login)

        var driver_login_button : Button = findViewById(R.id.driver_login_button)
        driver_login_button.setOnClickListener {
            var driver_login_button_Intent = Intent(this, Driver_Dashboard::class.java)
            startActivity(driver_login_button_Intent)
        }
    }

}