package com.example.stafflinkmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.TimePicker

class Find_Transport : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_transport)

        val morning : LinearLayout = findViewById(R.id.morning)
        val evening : LinearLayout = findViewById(R.id.evening)

        val timePicker1: TimePicker = findViewById(R.id.datePicker1)
        timePicker1.setIs24HourView(true)

        val timePicker2: TimePicker = findViewById(R.id.datePicker2)
        timePicker2.setIs24HourView(true)

        val timePicker3: TimePicker = findViewById(R.id.datePicker3)
        timePicker3.setIs24HourView(true)

        val timePicker4: TimePicker = findViewById(R.id.datePicker4)
        timePicker4.setIs24HourView(true)

        val spinner: Spinner = findViewById(R.id.dropPlaceSpinner)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Get the selected item from the spinner
                val selectedItem = parent?.getItemAtPosition(position).toString()

                // Use the selected item as needed
                Log.d("Spinner", "Selected item: $selectedItem")

                if (selectedItem.lowercase() == "both") {
                    timePicker1.visibility = View.VISIBLE
                    timePicker2.visibility = View.VISIBLE
                    timePicker3.visibility = View.VISIBLE
                    timePicker4.visibility = View.VISIBLE
                    morning.visibility = View.VISIBLE
                    evening.visibility = View.VISIBLE
                } else if (selectedItem.lowercase() == "morning") {
                    timePicker1.visibility = View.VISIBLE
                    timePicker2.visibility = View.VISIBLE
                    morning.visibility = View.VISIBLE
                    timePicker3.visibility = View.GONE
                    timePicker4.visibility = View.GONE
                    evening.visibility = View.GONE
                } else if (selectedItem.lowercase() == "evening") {
                    timePicker1.visibility = View.GONE
                    timePicker2.visibility = View.GONE
                    morning.visibility = View.GONE
                    timePicker3.visibility = View.VISIBLE
                    timePicker4.visibility = View.VISIBLE
                    evening.visibility = View.VISIBLE
                } else {
                    timePicker1.visibility = View.GONE
                    timePicker2.visibility = View.GONE
                    morning.visibility = View.GONE
                    timePicker3.visibility = View.GONE
                    timePicker4.visibility = View.GONE
                    evening.visibility = View.GONE
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle the case when no item is selected
            }
        }

    }
}