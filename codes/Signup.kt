package com.example.raspi
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Signup : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)



        val fname = findViewById<EditText>(R.id.fn)
        val lname = findViewById<EditText>(R.id.ln)
        val em =findViewById<EditText>(R.id.em)
        val pwd =findViewById<EditText>(R.id.p)
        val cwd =findViewById<EditText>(R.id.cp)

        val button = findViewById<Button>(R.id.bs)

        button.setOnClickListener {
            val text = fname.text.toString()
            val text1 = lname.text.toString()
            val text2 = em.text.toString()
            val text3 = pwd.text.toString()
            val text4 = cwd.text.toString()


            if (text.isEmpty()){
                Toast.makeText(this, "Please Fillout all the Fields", Toast.LENGTH_SHORT).show()
            }
            else if (text1.isEmpty()){
                Toast.makeText(this, "Please Fillout all the Fields", Toast.LENGTH_SHORT).show()
            }
            else if (text2.isEmpty()){
                Toast.makeText(this, "Please Fillout all the Fields", Toast.LENGTH_SHORT).show()
            }
            else if (text3.isEmpty()){
                Toast.makeText(this, "Please Fillout all the Fields", Toast.LENGTH_SHORT).show()
            }
            else if (text4.isEmpty()){
                Toast.makeText(this, "Please Fillout all the Fields", Toast.LENGTH_SHORT).show()
            }
            else if(text3!=text4){
                Toast.makeText(this, "Password not equals Confirm Password", Toast.LENGTH_SHORT).show()

            }
            else {
                // Do something with the non-empty text
                val intent = Intent(this,Accreated::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
