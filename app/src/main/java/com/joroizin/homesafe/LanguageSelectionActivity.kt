package com.joroizin.homesafe

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LanguageSelectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_selection)
    }

    fun languageSelected(view: View) {

        val intent = Intent(this, InfoActivity::class.java).apply {
        }
        startActivity(intent)

    }

    fun notSupported(view: View) {
        val text = "Not supported yet"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }
}
