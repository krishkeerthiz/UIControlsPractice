package com.example.uicontrolspractice

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val button = findViewById<ImageButton>(R.id.addBtn)

        button.setOnClickListener {
           Toast.makeText(this, "End of views", Toast.LENGTH_SHORT).show()
        }
    }
}