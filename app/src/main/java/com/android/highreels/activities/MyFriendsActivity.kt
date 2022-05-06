package com.android.highreels.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.highreels.R
import com.android.highreels.adapters.FriendsAdapter
import com.android.highreels.responseModels.FriendsResponse
import kotlinx.android.synthetic.main.activity_my_friends.*

class MyFriendsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_my_friends)
        val toolBar: Toolbar = materialToolBar
        toolBar.setNavigationOnClickListener {
            onBackPressed()
        }
        initRecyclerView()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    private fun initRecyclerView() {
        recyclerViewFriends.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true)
        val shareToResponseArrayList = ArrayList<FriendsResponse>()
        for (i in 1..20) {
            shareToResponseArrayList.add(
                FriendsResponse(
                    "https://api.androidhive.info/images/glide/medium/deadpool.jpg",
                    "Name " + i
                )
            )
            val adapter = FriendsAdapter(shareToResponseArrayList)
            recyclerViewFriends.adapter = adapter
            //adapter.setOnItemClickListener(this)
        }
    }
}