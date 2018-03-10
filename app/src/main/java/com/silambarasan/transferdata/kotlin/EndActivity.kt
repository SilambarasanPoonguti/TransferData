package com.silambarasan.transferdata.kotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.silambarasan.transferdata.R

/**
 * Created by SILAMBARASAN on 3/10/2018.
 */

class EndActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.end_activity_main)

        val txtName = findViewById<View>(R.id.name) as TextView
        val txtPin = findViewById<View>(R.id.pin) as TextView
        val txtEmail = findViewById<View>(R.id.email) as TextView

        // Get all the Data from start activity
        val name = intent.getStringExtra("NAME")
        val email = intent.getStringExtra("EMAIL")
        val pin = intent.getStringExtra("PIN")

        // Displaying Received data
        txtName.text = name
        txtPin.text = pin
        txtEmail.text = email

        findViewById<View>(R.id.btnBack).setOnClickListener { finish() }
    }
}
