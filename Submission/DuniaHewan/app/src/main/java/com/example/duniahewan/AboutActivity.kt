package com.example.duniahewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setActionBar("About Me")
    }

    private fun setActionBar(title: String) {
        supportActionBar?.title = title
    }
}