package com.android.highreels.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.SimpleItemAnimator
import com.android.highreels.R
import com.android.highreels.adapters.MyVideosAdapter
import com.android.highreels.appController.AppController
import com.android.highreels.responseModels.MyVideosResponse
import kotlinx.android.synthetic.main.activity_my_videos.*

class MyVideosActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_my_videos)
        val toolBar: Toolbar = materialToolBar
        toolBar.setNavigationOnClickListener {
            onBackPressed()
        }
        initRecyclerView()
        initListeners()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    private fun initListeners() {
        shareButton.setOnClickListener(this)
    }

    private fun initRecyclerView() {
        hMyVideosRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        (hMyVideosRecyclerView.itemAnimator as SimpleItemAnimator).supportsChangeAnimations = false
        hMyVideosRecyclerView.addItemDecoration(
            AppController.getInstance().setItemDecoration(this)
        )
        val myVideosArrayList = ArrayList<MyVideosResponse>()
        for (i in 1..3) {
            myVideosArrayList.add(
                MyVideosResponse(
                    "https://api.androidhive.info/images/glide/medium/deadpool.jpg",
                    "Name " + i
                )
            )
            val adapter = MyVideosAdapter(myVideosArrayList)
            hMyVideosRecyclerView.adapter = adapter
            //adapter.setOnItemClickListener(this)
        }
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.reportButton -> {
                var intent = Intent(this@MyVideosActivity, ShareActivity::class.java)
                startActivity(intent)
            }
        }
    }
}