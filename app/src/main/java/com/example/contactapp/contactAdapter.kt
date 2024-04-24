package com.example.contactapp

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class contactAdapter(private val context: Activity, private  val arraylist: ArrayList<UserData>):ArrayAdapter<UserData>(context,R.layout.contact_card , arraylist) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view:View = convertView?:LayoutInflater.from(context).inflate(R.layout.contact_card , null)

        val image:ImageView = view.findViewById(R.id.imagecard)
        val name:TextView = view.findViewById(R.id.namecard)
//        val number:TextView = view.findViewById<TextView>(R.id.detailnumber)

        image.setImageResource(arraylist[position].userdatapic)
        name.text = arraylist[position].userdataname



        return view
    }
}