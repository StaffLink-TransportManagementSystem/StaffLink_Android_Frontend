package com.example.stafflinkmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class add_vehicle_page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_vehicle_page2)

        var submit_button: Button = findViewById(R.id.submit_button);
        submit_button.setOnClickListener {
            var submit_Intent = Intent(this, Dashboard::class.java)
            startActivity(submit_Intent)
        }
    }
}