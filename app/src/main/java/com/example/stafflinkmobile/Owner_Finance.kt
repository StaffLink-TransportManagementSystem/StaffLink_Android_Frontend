package com.example.stafflinkmobile

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class Owner_Finance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_owner_finance)

        val dropPlaceSpinner: Spinner = findViewById(R.id.dropPlaceSpinner)
        val dropPlaceOptions = resources.getStringArray(R.array.drop_place_options)

        dropPlaceSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedOption = dropPlaceOptions[position]

                // Get reference to the parent layout where additional fields will be added
                val parentLayout: LinearLayout = findViewById(R.id.row1)

                // Remove all previously added additional fields
                parentLayout.removeAllViews()

                // Add additional fields based on selected option
                when (selectedOption) {
                    "Both" -> {
                        addTextField(parentLayout, "Field 1")
                        addTextField(parentLayout, "Field 2")
                        addTextField(parentLayout, "Field 3")
                        addTextField(parentLayout, "Field 4")
                    }
                    "Morning" -> {
                        addTextField(parentLayout, "Field 1")
                        addTextField(parentLayout, "Field 2")
                    }
                    else -> {
                        // No additional fields needed for other options
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do nothing
            }
        }
    }

    private fun addTextField(parentLayout: LinearLayout, fieldName: String) {
        val textInputLayout = TextInputLayout(this)
        textInputLayout.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        val editText = EditText(this)
        editText.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        editText.hint = fieldName

        textInputLayout.addView(editText)
        parentLayout.addView(textInputLayout)
    }
}
