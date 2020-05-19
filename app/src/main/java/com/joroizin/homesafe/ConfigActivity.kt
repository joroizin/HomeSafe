package com.joroizin.homesafe

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ConfigActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_config)
    }


    fun onContinue(view: View) {

        val intent = Intent(this, MainActivity::class.java).apply {
        }
        startActivity(intent)

    }
}
