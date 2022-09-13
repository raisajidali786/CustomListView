package com.codewsa.customlistview

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.TextView

class MyListAdapter(private val activity: Activity,private val arrayTitle : Array<String>)
    : ArrayAdapter<String>(activity,R.layout.custom_list_item_layout,arrayTitle){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = activity.layoutInflater
        val view = inflater.inflate(R.layout.custom_list_item_layout,null,false)
        val title = view.findViewById<TextView>(R.id.titleTv)
        title.text = arrayTitle[position]
        return view
    }
}