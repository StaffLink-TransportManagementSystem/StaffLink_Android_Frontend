package com.example.stafflinkmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Passenger_Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passenger_dashboard)

        var find_transport : CardView = findViewById(R.id.findTransport)

        find_transport.setOnClickListener {
            var find_transport_Intent = Intent(this, Find_Transport::class.java)
            startActivity(find_transport_Intent)
        }

        var requests : CardView = findViewById(R.id.requests)
        requests.setOnClickListener {
            var requests_Intent = Intent(this, Passenger_Requests::class.java)
            startActivity(requests_Intent)
        }

        var reservations : CardView = findViewById(R.id.my_reservations)
        reservations.setOnClickListener {
            var reservations_Intent = Intent(this, Passenger_Reservations::class.java)
            startActivity(reservations_Intent)
        }

        var absents : CardView = findViewById(R.id.absents)
        absents.setOnClickListener {
            var absents_Intent = Intent(this, Passenger_Absents::class.java)
            startActivity(absents_Intent)
        }

        var finances : CardView = findViewById(R.id.finance)
        finances.setOnClickListener {
            var finances_Intent = Intent(this, Passenger_Finance::class.java)
            startActivity(finances_Intent)
        }

    }


}