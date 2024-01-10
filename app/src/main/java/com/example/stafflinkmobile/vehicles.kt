package com.example.stafflinkmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast

class vehicles : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vehicles)

        val types = arrayOf("Car", "Van", "Bus");
        val autoComplete : AutoCompleteTextView = findViewById(R.id.type);
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, types);
        autoComplete.setAdapter(adapter);

        autoComplete.onItemClickListener = AdapterView.OnItemClickListener {
             adapterView, view, i, l ->
            val selectedItem = adapterView.getItemAtPosition(i);
            Toast.makeText(this, "Item: $selectedItem", Toast.LENGTH_SHORT).show();
        }
    }
}