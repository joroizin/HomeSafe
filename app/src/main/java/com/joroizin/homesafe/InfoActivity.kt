package com.joroizin.homesafe

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
    }


    fun onContinue(view: View) {

        val intent = Intent(this, ConfigActivity::class.java).apply {
        }
        startActivity(intent)

    }
}
