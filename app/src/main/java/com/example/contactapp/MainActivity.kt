package com.example.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    public lateinit var userarraylist:ArrayList<UserData>
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contactpicarray:IntArray = intArrayOf(
            R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7,
        )
        val contactnamearray:ArrayList<String> = arrayListOf(
            "Moiz","Ali","Talha","Hamza","Moeed","Abbasi","Mughal"
        )
        val contactnumberarray:ArrayList<String> = arrayListOf(
            "03095956988","03095956988","03095956988","03095956988","03095956988","03095956988","03095956988"
        )
    userarraylist = ArrayList()
        for(position in contactnamearray.indices)
            {
//            val contact = UserData(contactpicarray[position],contactnamearray[position],contactnumberarray[position])
                userarraylist.add(UserData(contactpicarray[position],contactnamearray[position],contactnumberarray[position]))
        }
    val listview:ListView = findViewById<ListView>(R.id.mainlist)
        listview.adapter = contactAdapter(this,userarraylist)
        listview.isClickable = true
        listview.setOnItemClickListener { parent, view, position, id ->
            val image = contactpicarray[position]
            val name = contactnamearray[position]
            val number = contactnumberarray[position]

            val intent = Intent(this,contact_details::class.java)
            intent.putExtra("pic" , image)
            intent.putExtra("name" , name)
            intent.putExtra("number" , number)
            startActivity(intent)

        }

    finish()
    }

}































//        val contactlist:List<Model> = listOf(
//            Model(R.drawable.image1,"Moiz"),
//            Model(R.drawable.image2,"Ali"),
//            Model(R.drawable.image3,"Talha"),
//            Model(R.drawable.image4,"Moeed"),
//            Model(R.drawable.image5,"Ehraz"),
//            Model(R.drawable.image6,"Waleed"),
//            Model(R.drawable.image7,"Imtiaz"),
//        )
//
//        val contactname:List<String> = contactlist.map { it.name }
//        val listView:ListView = findViewById(R.id.list1)
//        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , contactname)
//        listView.adapter = adapter
//
//    }
//
//}
//
//data class Model(val image:Int, val name:String)
//    {
//}