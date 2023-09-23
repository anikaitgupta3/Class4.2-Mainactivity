package com.example.class42_mainactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExampleAdapter(private val List:List<String>):RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {

 class ExampleViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
   val textView:TextView=itemView.findViewById(R.id.text_view)//itemview is used to get ref of textview
 }//the class should be extending recyclerview.viewholder.class name could be anything

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
      val itemView=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)//context provides the context of viewgroup
        return ExampleViewHolder(itemView)//we are returning an object of class exampleviewholder and passing itemview
    } //the parent,viewType arguments are provided by the recyclerview

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
       val currentItem=List[position]
        holder.textView.text=currentItem

    }

    override fun getItemCount(): Int {
      return List.size//we take input listof things we want to display like 1000 strings.all the things we want to display
    }
}
//can also define the ExampleViewHolder outside and pass just ExampleViewHolder