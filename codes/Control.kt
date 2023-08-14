package com.example.raspi

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Successful : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_successful)

        val button = findViewById<Button>(R.id.dl)

        //DOOR LOCK LINK
        val url = "http://192.168.177.243:8080/"

        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val btton = findViewById<Button>(R.id.pir)

        //PIR MOTION SENSOR LINK
        val ur = "https://mail.google.com/mail/mu/mp/331/#tl/priority/%5Esmartlabel_personal"

        btton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(ur))
            startActivity(intent)
        }

        val bton = findViewById<Button>(R.id.mail)

        //MAIL LINK
        val u = "https://console.firebase.google.com/u/0/project/loginpg-a71af/database/loginpg-a71af-default-rtdb/data"


        bton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(u))
            startActivity(intent)
        }
        val bt = findViewById<ImageButton>(R.id.home)
        bt.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)

            startActivity(intent)
            finish()}
    }
}
