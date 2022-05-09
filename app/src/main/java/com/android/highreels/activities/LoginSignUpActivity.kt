package com.android.highreels.activities

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.highreels.R
import kotlinx.android.synthetic.main.activity_login_signup.*
import kotlinx.android.synthetic.main.logo_text_layout.view.*

class LoginSignUpActivity : AppCompatActivity(), View.OnClickListener,
    TextView.OnEditorActionListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_login_signup)
        initListeners()
    }

    private fun initListeners() {
        relativeLayoutSignUpInActive.setOnClickListener(this)
        relativeLayoutSignInInactive.setOnClickListener(this)
        buttonSignIn.setOnClickListener(this)
        buttonSignUp.setOnClickListener(this)
        editTextPassword.setOnEditorActionListener(this)
        editTextMobileNumber.setOnEditorActionListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.relativeLayoutSignUpInActive -> {
                logo_layout.textViewWelcome.text = resources.getString(R.string.welcome_text)
                linearLayoutSignUpActive.visibility = View.VISIBLE
                scrollViewSignIn.visibility = View.GONE
                scrollViewSignUp.visibility = View.VISIBLE
                linearLayoutSignInActive?.visibility = View.GONE
            }
            R.id.relativeLayoutSignInInactive -> {
                logo_layout.textViewWelcome.text = resources.getString(R.string.login_text)
                scrollViewSignIn.visibility = View.VISIBLE
                scrollViewSignUp.visibility = View.GONE
                linearLayoutSignUpActive.visibility = View.GONE
                linearLayoutSignInActive?.visibility = View.VISIBLE
            }
            R.id.buttonSignIn -> {
                var intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
            R.id.buttonSignUp -> {
                var intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onEditorAction(textView: TextView?, actionId: Int, keyEvent: KeyEvent?): Boolean {
        var handled = false
        when (textView?.id) {
            R.id.editTextPassword -> if (actionId == EditorInfo.IME_ACTION_DONE) {
                buttonSignIn.performClick()
                handled = true
            }
            R.id.editTextMobileNumber -> if (actionId == EditorInfo.IME_ACTION_DONE) {
                buttonSignUp.performClick()
                handled = true
            }
        }
        return handled
    }
}