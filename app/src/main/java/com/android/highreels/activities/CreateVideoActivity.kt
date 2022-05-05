package com.android.highreels.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.android.highreels.R
import kotlinx.android.synthetic.main.activity_create_video.*

class CreateVideoActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_create_video)
        initListeners()
    }

    private fun initListeners() {
        relativeLayoutOne.setOnClickListener(this)
        relativeLayoutTwo.setOnClickListener(this)
        relativeLayoutThree.setOnClickListener(this)
        relativeLayoutFour.setOnClickListener(this)
        relativeLayoutUploadVideo.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.relativeLayoutOne -> {
            }
            R.id.relativeLayoutTwo -> {
            }
            R.id.relativeLayoutThree -> {
            }
            R.id.relativeLayoutFour -> {
            }
            R.id.relativeLayoutUploadVideo -> {
            }
        }
    }
}