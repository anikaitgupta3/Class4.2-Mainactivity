package com.example.class42_mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        val recyclerView=findViewById<RecyclerView>(R.id.recycler_view)

        val exampleList=generateList(1000)
        recyclerView.adapter=ExampleAdapter(exampleList)
        recyclerView.layoutManager=LinearLayoutManager(this)
    }
    private fun generateList(itemCount:Int):List<String>{
        val mutablelist= mutableListOf<String>()

        for(i in 1..itemCount){
            mutablelist.add(i.toString())
        }
     return mutablelist.toList()//CONVERTING FROM MUTABLE TO NORMAL
    }
}