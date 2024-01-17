package com.example.stafflinkmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        var Add_Vehicle : CardView = findViewById(R.id.Add_Vehicle)
        Add_Vehicle.setOnClickListener {
            var Add_Vehicle_Intent = Intent(this, add_vehicle_page1::class.java)
            startActivity(Add_Vehicle_Intent)
        }

        var vehicles : CardView = findViewById(R.id.vehicles)
        vehicles.setOnClickListener {
            var vehicles_Intent = Intent(this, Vehicles::class.java)
            startActivity(vehicles_Intent)
        }

        var Add_Driver : CardView = findViewById(R.id.Add_Driver)
        Add_Driver.setOnClickListener {
            var Add_Driver_Intent = Intent(this, add_driver_page1::class.java)
            startActivity(Add_Driver_Intent)
        }

        var drivers : CardView = findViewById(R.id.drivers)
        drivers.setOnClickListener {
            var drivers_Intent = Intent(this, Drivers::class.java)
            startActivity(drivers_Intent)
        }

        var passengers : CardView = findViewById(R.id.passengers)
        passengers.setOnClickListener {
            var passengers_Intent = Intent(this, Passengers::class.java)
            startActivity(passengers_Intent)
        }

        var requests : CardView = findViewById(R.id.requests)
        requests.setOnClickListener {
            var requests_Intent = Intent(this, Requests::class.java)
            startActivity(requests_Intent)
        }

        var reservations : CardView = findViewById(R.id.reservations)
        reservations.setOnClickListener {
            var reservations_Intent = Intent(this, Reservations::class.java)
            startActivity(reservations_Intent)
        }

        var finances : CardView = findViewById(R.id.finance)
        finances.setOnClickListener {
            var finances_Intent = Intent(this, Owner_Finance::class.java)
            startActivity(finances_Intent)
        }
    }
}