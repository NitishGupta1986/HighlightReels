package com.android.highreels.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.highreels.R

class ShareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_share)
    }
}