package com.example.stafflinkmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var topAnim: Animation
    private lateinit var bottomAnim: Animation
    private lateinit var image: ImageView
    private lateinit var slogan: TextView
    private var SPLASH_SCREEN:Int = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//<<<<<<< HEAD
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        image = findViewById(R.id.img)
        slogan = findViewById(R.id.txt)

        image.setAnimation(topAnim);
        slogan.setAnimation(bottomAnim);

//        val getStarted: Button = findViewById(R.id.button2)
//        getStarted.setOnClickListener {
//            setContentView(R.layout.activity_register  )
//        }
//
        Handler(Looper.getMainLooper()).postDelayed({
            var register_Intent = Intent(this,Login :: class.java )
            startActivity(register_Intent)
        }, SPLASH_SCREEN.toLong())

    }
}