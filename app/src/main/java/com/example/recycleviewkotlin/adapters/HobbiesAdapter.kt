package com.example.recycleviewkotlin.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewkotlin.Interface.OnItemClickListener

import com.example.recycleviewkotlin.R
import com.example.recycleviewkotlin.models.Hobby
import kotlinx.android.synthetic.main.list_item.view.*

//Same as java
//extends RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>()
class HobbiesAdapter(
    private val context: Context,
    private val hobbies: List<Hobby>,
    private val clickListener: OnItemClickListener
) :
    RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.bindItemClick(hobby, clickListener)
        holder.bindShare(hobby, clickListener)

    }
    //Create ViewHolder
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //modify the the ViewHolder
        fun bindItemClick(hobby: Hobby?, listener: OnItemClickListener) {
            itemView.tvTitle.text = hobby?.title
            itemView.setOnClickListener { listener.onItemClick(hobby) }
        }
        //modify the the ViewHolder
        fun bindShare(hobby: Hobby?, listener: OnItemClickListener) {
            itemView.imgView.setOnClickListener { listener.shareItemClick(hobby) }
        }

    }


}