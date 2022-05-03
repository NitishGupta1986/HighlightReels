package com.android.highreels.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.highreels.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //supportActionBar?.hide()
        supportActionBar?.title = "Nitish Gupta"
        supportActionBar?.subtitle = "Nitish"
    }
}