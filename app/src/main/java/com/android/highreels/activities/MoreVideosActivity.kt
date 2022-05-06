package com.android.highreels.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.android.highreels.R
import com.android.highreels.adapters.MoreVideosAdapter
import com.android.highreels.responseModels.MoreVideosResponse
import kotlinx.android.synthetic.main.activity_more_videos.*

class MoreVideosActivity : AppCompatActivity() {
    val myVideosArrayList = ArrayList<MoreVideosResponse>()
    private var numberOfColoumns: Int = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_more_videos)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        recyclerViewMoreVideos.layoutManager = GridLayoutManager(this, numberOfColoumns)
        recyclerViewMoreVideos.setHasFixedSize(true)
        recyclerViewMoreVideos.itemAnimator = DefaultItemAnimator()
        for (i in 1..20) {
            myVideosArrayList.add(
                MoreVideosResponse(
                    "https://api.androidhive.info/images/glide/medium/deadpool.jpg",
                    "Name " + i, "19 Mins Ago"
                )
            )
            //adapter.setOnItemClickListener(this)
        }
        val adapter = MoreVideosAdapter(myVideosArrayList)
        recyclerViewMoreVideos.adapter = adapter
    }
}