package com.example.stafflinkmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Drivers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drivers)

        var driver_details : CardView = findViewById(R.id.driver_details)
        driver_details.setOnClickListener {
            var driver_details_Intent = Intent(this, Driver_Details::class.java)
            startActivity(driver_details_Intent)
        }
    }
}