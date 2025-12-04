package com.example.helloandroidui

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.textfield.TextInputEditText

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val toolbar: MaterialToolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        val submitButton: Button = findViewById(R.id.submitButton)
        val nameInput: TextInputEditText = findViewById(R.id.nameInput)

        submitButton.setOnClickListener {
            val name = nameInput.text.toString()

            // Use an if-else expression, which is the Kotlin equivalent of the ternary operator
            val greeting = if (name.isEmpty()) {
                "Great to see you in Android development!"
            } else {
                "Hello, $name! Welcome back to Android development!"
            }

            Toast.makeText(this, greeting, Toast.LENGTH_SHORT).show()
        }
    }
}
