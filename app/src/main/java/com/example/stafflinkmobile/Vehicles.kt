package com.example.stafflinkmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Vehicles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vehicles)

        var vehicle_details : CardView = findViewById(R.id.vehicle_details)
        vehicle_details.setOnClickListener {
            var vehicle_details_Intent = Intent(this, vehicle_details::class.java)
            startActivity(vehicle_details_Intent)
        }
    }

}