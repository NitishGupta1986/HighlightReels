package com.android.highreels.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.android.highreels.R
import com.android.highreels.Toast.MDToast
import kotlinx.android.synthetic.main.activity_create_video.*

class CreateVideoActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_create_video)
        val toolBar: Toolbar = materialToolBar
        toolBar.setNavigationOnClickListener {
            onBackPressed()
        }
        initListeners()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
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
                ivOneThumbnail.visibility = View.VISIBLE
            }
            R.id.relativeLayoutTwo -> {
                ivTwoThumbnail.visibility = View.VISIBLE
            }
            R.id.relativeLayoutThree -> {
                ivThreeThumbnail.visibility = View.VISIBLE
            }
            R.id.relativeLayoutFour -> {
                ivFourThumbnail.visibility = View.VISIBLE
            }
            R.id.relativeLayoutUploadVideo -> {
                MDToast.makeText(this, "Uploading", MDToast.LENGTH_LONG).show()
            }
        }
    }
}