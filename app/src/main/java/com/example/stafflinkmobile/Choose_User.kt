package com.example.stafflinkmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Choose_User : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_user)

        var owner : CardView = findViewById(R.id.owner)
        owner.setOnClickListener {
            var owner_Intent = Intent(this, Login::class.java)
            startActivity(owner_Intent)
        }

        var driver : CardView = findViewById(R.id.driver)
        driver.setOnClickListener {
            var driver_Intent = Intent(this, Driver_Login::class.java)
            startActivity(driver_Intent)
        }

    }
}