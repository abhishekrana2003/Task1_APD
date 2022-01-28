package com.example.abhishekranaapd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button=findViewById(R.id.btn_submit)
        val name:TextView=findViewById(R.id.name)
        val age:TextView=findViewById(R.id.age)
        btn.setOnClickListener {
            if (name.text.toString().trim().isEmpty()) {
                Toast.makeText(this, "enter your name", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(
                    this,
                    "Hey,I am ${name.text.toString()},GO CORONA GO!",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

    }
}