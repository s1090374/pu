package com.example.pu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pujn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pujn)

        val backpage =findViewById<Button>(R.id.backbutton)
        backpage.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)

        }
    }
}