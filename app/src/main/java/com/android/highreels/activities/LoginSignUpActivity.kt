package com.android.highreels.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.android.highreels.R
import kotlinx.android.synthetic.main.activity_login_signup.*
import kotlinx.android.synthetic.main.logo_text_layout.view.*

class LoginSignUpActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_login_signup)
        relativeLayoutSignUpInActive.setOnClickListener(this)
        relativeLayoutSignInInactive.setOnClickListener(this)
        buttonSignIn.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.relativeLayoutSignUpInActive -> {

                logo_layout.textViewWelcome.text = "Welcome to Highlight Reel"
                linearLayoutSignUpActive.visibility = View.VISIBLE
                scrollViewSignIn.visibility = View.GONE
                scrollViewSignUp.visibility = View.VISIBLE
                linearLayoutSignInActive?.visibility = View.GONE
            }
            R.id.relativeLayoutSignInInactive -> {
                logo_layout.textViewWelcome.text = "Sign In to Highlight Reel"
                scrollViewSignIn.visibility = View.VISIBLE
                scrollViewSignUp.visibility = View.GONE
                linearLayoutSignUpActive.visibility = View.GONE
                linearLayoutSignInActive?.visibility = View.VISIBLE
            }
            R.id.buttonSignIn -> {
                var intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)

            }
        }
    }
}