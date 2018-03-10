package com.silambarasan.transferdata.kotlin

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText

import com.silambarasan.transferdata.R

/**
 * Created by SILAMBARASAN on 3/10/2018.
 */

class StartActivity : AppCompatActivity() {

    private var name: EditText? = null
    private var pin: EditText? = null
    private var email: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.start_activity_main)

        // Initialize
        name = findViewById(R.id.userName)
        pin = findViewById(R.id.email)
        email = findViewById(R.id.pin)

        // Handling button event
        findViewById<View>(R.id.btnSubmit).setOnClickListener {
            // Starting a new Intent
            val nextScreen = Intent(applicationContext, EndActivity::class.java)
            nextScreen.putExtra("NAME", name?.text.toString())
            nextScreen.putExtra("PIN", pin?.text.toString())
            nextScreen.putExtra("EMAIL", email?.text.toString())

            //Send data to another Activity
            startActivity(nextScreen)
        }
    }
}
