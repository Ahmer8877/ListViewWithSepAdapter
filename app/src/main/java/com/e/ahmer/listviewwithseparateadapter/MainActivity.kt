package com.e.ahmer.listviewwithseparateadapter

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //inialize the array list with data class

    lateinit var userArrayList: ArrayList<UserData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //All list names array

        val name=arrayOf("Ahmer Rajpoot","Javed Khan","Abu Bakar","Zohaib","Azam Ali")
        //All list lastMsg  array

        val lastMsg=arrayOf("Good Morning!","Good Luck","Good Night","Nighty Nighty","I call to later")
        //All list lastMsgTime  array

        val lastMsgTime=arrayOf("4:50 AM","5:50 AM","6:50 AM","7:50 AM","9:50 AM")
        // All list member phone numbers
        val PhoneNumber=arrayOf("03025454858","03045454858","03005454858","03055454858","03035454858")

        //All list member proflie image id's
        val imageid= intArrayOf(R.drawable.pic1,R.drawable.pic0,R.drawable.pic1,R.drawable.pic0,R.drawable.pic1)

        //initalise the array list

        userArrayList= ArrayList()

        //create for loop for show the all list members

        for (eachIndex in name.indices){
            val user= UserData(name[eachIndex],lastMsg[eachIndex],lastMsgTime[eachIndex], PhoneNumber[eachIndex],imageid[eachIndex])

            //this user vari data add the user Array list
            userArrayList.add(user)
        }
        //list view find id
        val listview=findViewById<ListView>(R.id.listItems)
        //give permission to clickable
        listview.isClickable=true
        //create the separate adapter for My Adapter
        listview.adapter= MyAdapter(this,userArrayList)
    }
}