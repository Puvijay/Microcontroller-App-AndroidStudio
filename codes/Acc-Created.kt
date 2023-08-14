package com.example.raspi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Accreated : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accreated)


        val Bm = findViewById<Button>(R.id.b)
        Bm.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)

            startActivity(intent)
        finish()}
    }
    }
