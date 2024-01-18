package com.example.stafflinkmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Passengers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passengers)

        var passenger_details : CardView = findViewById(R.id.passenger_details)
        passenger_details.setOnClickListener {
            var passenger_details_Intent = Intent(this, Passenger_Details::class.java)
            startActivity(passenger_details_Intent)
        }
    }
}