package com.example.helloandroidui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Find the Toolbar defined in the layout
        val toolbar: MaterialToolbar = findViewById(R.id.toolbar)

        // 2. Set this Toolbar as the ActionBar for this Activity
        setSupportActionBar(toolbar)

        // Note: The title "HelloAndroid" is already set in the XML layout for the Toolbar.

        // Optional: Setup the button functionality
        val clickButton: Button = findViewById(R.id.clickMeButton)
        clickButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
