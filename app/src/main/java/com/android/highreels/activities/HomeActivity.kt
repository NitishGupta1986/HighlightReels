package com.android.highreels.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.android.highreels.R
import kotlinx.android.synthetic.main.activity_login_signup.*
import kotlinx.android.synthetic.main.logo_text_layout.view.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        logo_layout.textViewWelcome.visibility = View.GONE
        setContentView(R.layout.activity_home)

    }
}