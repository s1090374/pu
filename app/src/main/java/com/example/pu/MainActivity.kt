package com.example.pu

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextapage =findViewById<Button>(R.id.nextcbutton)
        nextapage.setOnClickListener {
            val Intent = Intent(this, providencehall::class.java)
            startActivity(Intent)
        }
        val nextpage =findViewById<Button>(R.id.nextdbutton)
        nextpage.setOnClickListener {
            val Intent = Intent(this, pugym::class.java)
            startActivity(Intent)
        }
        val nextbpage =findViewById<Button>(R.id.nextbbutton)
        nextbpage.setOnClickListener {
            val Intent = Intent(this, pusmt::class.java)
            startActivity(Intent)
        }
        val nextcpage =findViewById<Button>(R.id.nextabutton)
        nextcpage.setOnClickListener {
            val Intent = Intent(this, pulu::class.java)
            startActivity(Intent)
        }
        val nextdpage =findViewById<Button>(R.id.nextebutton)
        nextdpage.setOnClickListener {
            val Intent = Intent(this, pulibrary::class.java)
            startActivity(Intent)
        }
        val nextepage =findViewById<Button>(R.id.nextfbutton)
        nextepage.setOnClickListener {
            val Intent = Intent(this, pufj::class.java)
            startActivity(Intent)
        }
        val nextfpage =findViewById<Button>(R.id.nextgbutton)
        nextfpage.setOnClickListener {
            val Intent = Intent(this, pusu::class.java)
            startActivity(Intent)
        }
        val nextgpage =findViewById<Button>(R.id.nexthbutton)
        nextgpage.setOnClickListener {
            val Intent = Intent(this, pujn::class.java)
            startActivity(Intent)
        }
        val nexthpage =findViewById<Button>(R.id.nextibutton)
        nexthpage.setOnClickListener {
            val Intent = Intent(this, pubd::class.java)
            startActivity(Intent)
        }
        val nextipage =findViewById<Button>(R.id.nextjbutton)
        nextipage.setOnClickListener {
            val Intent = Intent(this, pugl::class.java)
            startActivity(Intent)
        }
    }
}
