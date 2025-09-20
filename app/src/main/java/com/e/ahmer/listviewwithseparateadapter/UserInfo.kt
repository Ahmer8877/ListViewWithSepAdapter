package com.e.ahmer.listviewwithseparateadapter

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import de.hdodenhof.circleimageview.CircleImageView

class UserInfo : AppCompatActivity() {
    @SuppressLint("UseKtx")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        val name=intent.getStringExtra("name")
        val phoneNumber=intent.getStringExtra("PhoneNumber")
        val userImage=intent.getIntExtra("imageid",R.drawable.pic0)

        val nametext=findViewById<TextView>(R.id.nametext)
        val phone=findViewById<TextView>(R.id.phoneNumber)
        val dp=findViewById<CircleImageView>(R.id.profile_image)

        nametext.text=name
        phone.text=phoneNumber
        dp.setImageResource(userImage)

        val callbtn=findViewById<ImageButton>(R.id.callbutton)

        callbtn.setOnClickListener {

            val mecall= Intent(Intent.ACTION_VIEW)
            mecall.data= Uri.parse("https://wa.me/qr/ECJDRCYFI53AA1")
            startActivity(mecall)
        }

        val backbtn=findViewById<ImageButton>(R.id.imageButtonback)

        backbtn.setOnClickListener {
            finish()
        }


    }
}