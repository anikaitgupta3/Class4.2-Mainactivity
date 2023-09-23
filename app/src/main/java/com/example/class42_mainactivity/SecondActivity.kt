package com.example.class42_mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nameTV=findViewById<TextView>(R.id.name_tv)
        val emailTV=findViewById<TextView>(R.id.email_tv)

        if(intent.hasExtra("EnteredName")) {
            val name = intent.extras?.get("EnteredName").toString() //nullable so ?
            //val name=intent.getStringExtra("EnteredName") //also nullable but name can be null
            //val name=intent.getStringExtra("EnteredName")?.length()  //we are doing something so null check
            //val name=intent.getStringExtra("EnteredName") ?: "" //if null then value is empty string
            nameTV.text=name

        }
        if(intent.hasExtra("EnteredEmail")){
            val email = intent.extras?.get("EnteredEmail").toString()
            emailTV.text=email
        }
    }
}