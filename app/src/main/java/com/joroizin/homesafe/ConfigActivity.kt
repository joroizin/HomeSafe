package com.joroizin.homesafe

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

//        val intent = Intent(this, ConfigActivity::class.java).apply {
//        }
//        startActivity(intent)

        val text = "Not supported yet"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }
}
