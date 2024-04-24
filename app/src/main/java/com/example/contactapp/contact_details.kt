package com.example.contactapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class contact_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)
        val findpic = findViewById<ImageView>(R.id.detailpic)
        val findname = findViewById<TextView>( R.id.namedetail)
        val findnum = findViewById<TextView>(R.id.detailnumber)
        val findbckbtn = findViewById<ImageView>(R.id.backbtn)
        val findcallbtn = findViewById<Button>(R.id.call_btn)

        val getname:String? = intent.getStringExtra("name")
        val getnum:String? = intent.getStringExtra("number")
        val getpic:Int = intent.getIntExtra("pic" , R.drawable.image2)

        findpic.setImageResource(getpic)
        findname.text = getname
        findnum.text = getnum

        findbckbtn.setOnClickListener {
            val intent:Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        findcallbtn.setOnClickListener {
            val intentcall = Intent(Intent.ACTION_DIAL , Uri.parse("tel:03095956988"))
            startActivity(intentcall)
        }
    }
}