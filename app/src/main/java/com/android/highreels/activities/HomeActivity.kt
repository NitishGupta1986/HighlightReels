package com.android.highreels.activities

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.inputmethod.EditorInfo
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import com.android.highreels.R
import com.android.highreels.customViewRegular.RegularEditText
import kotlinx.android.synthetic.main.activity_home.*
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
                var intent = Intent(this@HomeActivity, MyVideosActivity::class.java)
                startActivity(intent)
            }
            R.id.imageViewCreateVideos -> {
                var intent = Intent(this@HomeActivity, CreateVideoActivity::class.java)
                startActivity(intent)
            }
            R.id.imageViewFriendsVideos -> {
                var intent = Intent(this@HomeActivity, FriendsVideosActivity::class.java)
                startActivity(intent)
            }
            R.id.imageViewMyAccount -> {
                var intent = Intent(this@HomeActivity, MyProfileActivity::class.java)
                startActivity(intent)
            }
            R.id.imageViewAddFriend -> {
                showDialog()
            }
        }
    }

    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setCanceledOnTouchOutside(true)
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        dialog.setContentView(R.layout.dialog_add_friend)
        val editTextFriendID = dialog.findViewById(R.id.editTextFriendID) as RegularEditText
        val yesBtn = dialog.findViewById(R.id.imageViewAddFriend) as AppCompatImageView
        editTextFriendID.setOnEditorActionListener { view, actionId, keyEvent ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                dialog.dismiss()
                true
            } else {
                false
            }
        }
        yesBtn.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()

    }
}