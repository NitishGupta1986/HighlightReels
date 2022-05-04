package com.android.highreels.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.android.highreels.R
import com.android.highreels.Toast.MDToast
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_login_signup.logo_layout
import kotlinx.android.synthetic.main.logo_text_layout.view.*

class HomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()
        logo_layout.textViewWelcome.visibility = View.GONE
        initListeners()
    }

    private fun initListeners() {
        imageViewMyVideos.setOnClickListener(this)
        imageViewCreateVideos.setOnClickListener(this)
        imageViewFriendsVideos.setOnClickListener(this)
        imageViewMyAccount.setOnClickListener(this)
        imageViewAddFriend.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.imageViewMyVideos -> {
                var intent = Intent(this@HomeActivity, ShareActivity::class.java)
                startActivity(intent)
            }
            R.id.imageViewCreateVideos -> {
                MDToast.makeText(this, "Tapped", MDToast.LENGTH_LONG).show()
            }
            R.id.imageViewFriendsVideos -> {
                MDToast.makeText(this, "Tapped", MDToast.LENGTH_LONG).show()
            }
            R.id.imageViewMyAccount -> {
                MDToast.makeText(this, "Tapped", MDToast.LENGTH_LONG).show()
            }
            R.id.imageViewAddFriend -> {
                MDToast.makeText(this, "Tapped", MDToast.LENGTH_LONG).show()
            }
        }
    }
}