package com.example.raspi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.net.Uri
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthException
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

public infix fun Uri.startActivity(intent: Intent?) {}

//DATABASE
public lateinit var database: FirebaseDatabase
public lateinit var reference: DatabaseReference
//DATABASE

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //DATABASE
        database = FirebaseDatabase.getInstance()
        reference = database.reference.child("your_database_child_name")
        //DATABASE

        val ema= findViewById<EditText>(R.id.usernameEditText)
        val pass = findViewById<EditText>(R.id.passwordEditText)
        val lg = findViewById<Button>(R.id.loginButton)


        val myButton = findViewById<Button>(R.id.buttonsignup)
        myButton.setOnClickListener {
            val intent = Intent(this,Signup::class.java)

            startActivity(intent)
        }


        // Get Firebase Authentication instance
        val auth = FirebaseAuth.getInstance()

// Set up onClickListener for login button
        lg.setOnClickListener {
            // Retrieve email and password from text fields
            val email = ema.text.toString()
            val password = pass.text.toString()

            // Validate fields
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Sign in user with email and password
            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, start next activity
                        val intent = Intent(this, Successful::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        // Sign in failed, show error message
                        Toast.makeText(this, "Authentication failed", Toast.LENGTH_SHORT).show()
                    }
                }
        }
// Get a reference to the EditText and Button views
        val editText = findViewById<EditText>(R.id.txtt)
        val buttn = findViewById<Button>(R.id.bt)

// Set an OnClickListener on the Button to send the text to Firebase
        buttn.setOnClickListener {
            val text = editText.text.toString()
            reference.setValue(text).addOnCompleteListener {
                Toast.makeText(this, "Text sent to Database", Toast.LENGTH_SHORT).show()
            } } } }
