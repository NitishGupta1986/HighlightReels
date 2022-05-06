package com.android.highreels.activities

import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.SimpleItemAnimator
import com.android.highreels.R
import com.android.highreels.adapters.MyVideosAdapter
import com.android.highreels.appController.AppController
import com.android.highreels.responseModels.MyVideosResponse
import kotlinx.android.synthetic.main.activity_friends_videos.*


class FriendsVideosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends_videos)
        supportActionBar?.hide()
        val toolBar: Toolbar = materialToolBar
        toolBar.overflowIcon?.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_ATOP)
        toolBar.setNavigationOnClickListener {
            onBackPressed()
        }
        initRecyclerView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_add -> {
                //addSomething()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun initRecyclerView() {
        hMyVideosRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        (hMyVideosRecyclerView.itemAnimator as SimpleItemAnimator).supportsChangeAnimations =
            false
        hMyVideosRecyclerView.addItemDecoration(AppController.getInstance().setItemDecoration(this))
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

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}