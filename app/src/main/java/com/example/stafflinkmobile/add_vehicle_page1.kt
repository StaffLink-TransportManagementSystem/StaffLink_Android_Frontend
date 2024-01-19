package com.example.stafflinkmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast

class add_vehicle_page1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_vehicle_page1)

        val types = arrayOf("Car", "Van", "Bus");
        val autoComplete : AutoCompleteTextView = findViewById(R.id.type);
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, types);
        autoComplete.setAdapter(adapter);

        autoComplete.onItemClickListener = AdapterView.OnItemClickListener {
             adapterView, view, i, l ->
            val selectedItem = adapterView.getItemAtPosition(i);
            Toast.makeText(this, "Item: $selectedItem", Toast.LENGTH_SHORT).show();
        }

        var next_button:Button = findViewById(R.id.next_button);
        next_button.setOnClickListener {
            var add_vehicle_page2_Intent = Intent(this, add_vehicle_page2::class.java)
            startActivity(add_vehicle_page2_Intent)
        }
    }
}