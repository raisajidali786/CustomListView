package com.codewsa.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var listView : ListView
    private val titleArray = arrayOf("Pakistan","India","Afghanistan","Bangladesh","China","SriLanka")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)
        val listAdapter = MyListAdapter(this,titleArray)
        listView.adapter = listAdapter
    }
}