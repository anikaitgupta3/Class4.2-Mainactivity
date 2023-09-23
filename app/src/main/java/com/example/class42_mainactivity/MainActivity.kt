package com.example.class42_mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameET=findViewById<EditText>(R.id.name_et)
        val emailET=findViewById<EditText>(R.id.email_et)
        val submitbutton=findViewById<Button>(R.id.submit_button)

        submitbutton.setOnClickListener {
            val name=nameET.text
            val email=emailET.text

            val intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("EnteredName",name)//we are also passing the name
            //intent.putExtra("EnteredName",name.toString())
            intent.putExtra("EnteredEmail",email)//we are also passing the email
            //intent.putExtra("EnteredEmail",email.toString())
            startActivity(intent)

        }

    }
}