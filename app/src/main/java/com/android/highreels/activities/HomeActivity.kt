package com.android.highreels.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.android.highreels.R
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_login_signup.logo_layout
import kotlinx.android.synthetic.main.logo_text_layout.view.*

class HomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        logo_layout.textViewWelcome.visibility = View.GONE
        setContentView(R.layout.activity_home)
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
            }
            R.id.imageViewCreateVideos -> {
            }
            R.id.imageViewFriendsVideos -> {
            }
            R.id.imageViewMyAccount -> {
            }
            R.id.imageViewAddFriend -> {
            }

        }

    }
}