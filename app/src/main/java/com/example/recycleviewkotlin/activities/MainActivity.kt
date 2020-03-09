package com.example.recycleviewkotlin.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewkotlin.Interface.OnItemClickListener
import com.example.recycleviewkotlin.R
import com.example.recycleviewkotlin.adapters.HobbiesAdapter
import com.example.recycleviewkotlin.models.Hobby
import com.example.recycleviewkotlin.models.Supplier
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnItemClickListener {

    //Click Item
    override fun onItemClick(hobby: Hobby?) {
        Toast.makeText(this, hobby?.title, Toast.LENGTH_SHORT).show()

    }
    //Click Share
    override fun shareItemClick(hobby: Hobby?) {
        val message = "My hobby is ${hobby?.title}"
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.putExtra(Intent.EXTRA_TEXT, message)
        intent.type = "text/plain"

        startActivity(Intent.createChooser(intent, "Share to : "))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    //Connect RecyclerView with Adapter
    private fun initView() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = RecyclerView.VERTICAL

        recyclerView.layoutManager = layoutManager
        val adapter = HobbiesAdapter(this, Supplier.hobbies, this)
        recyclerView.adapter = adapter

    }
}
