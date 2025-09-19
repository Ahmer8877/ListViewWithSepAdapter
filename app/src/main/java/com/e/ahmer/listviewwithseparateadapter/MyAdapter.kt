package com.e.ahmer.listviewwithseparateadapter

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter (private val context: Activity,private val arrayList: ArrayList<UserData>) : ArrayAdapter<UserData>(context,R.layout.eachlistitem,arrayList){

    @SuppressLint("ViewHolder", "InflateParams")

    //override the getview method
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflator= LayoutInflater.from(context)
        val view=inflator.inflate(R.layout.eachlistitem,null)

        //find all list item id's
        val image=view.findViewById<CircleImageView>(R.id.profile_image)
        val name=view.findViewById<TextView>(R.id.nametext)
        val lastMsg=view.findViewById<TextView>(R.id.lastmsg)
        val lastMsgTime=view.findViewById<TextView>(R.id.lastTimeText)

       //set the all list item in list
        image.setImageResource(arrayList[position].imageid)
        name.text=arrayList[position].name
        lastMsg.text=arrayList[position].lastMsg
        lastMsgTime.text=arrayList[position].lastMsgTime
        return view
    }
}