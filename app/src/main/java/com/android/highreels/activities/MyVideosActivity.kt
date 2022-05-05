package com.android.highreels.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.android.highreels.R
import com.android.highreels.adapters.MyVideosAdapter
import com.android.highreels.responseModels.MyVideosResponse
import kotlinx.android.synthetic.main.activity_my_videos.*

class MyVideosActivity : AppCompatActivity() {
    val myVideosArrayList = ArrayList<MyVideosResponse>()
    private var numberOfColoumns: Int = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_my_videos)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        recyclerViewMyVideos.layoutManager = GridLayoutManager(this, numberOfColoumns)
        recyclerViewMyVideos.setHasFixedSize(true)
        recyclerViewMyVideos.itemAnimator = DefaultItemAnimator()
        for (i in 1..20) {
            myVideosArrayList.add(
                MyVideosResponse(
                    "https://api.androidhive.info/images/glide/medium/deadpool.jpg",
                    "Name " + i, "19 Mins Ago"
                )
            )
            //adapter.setOnItemClickListener(this)
        }
        val adapter = MyVideosAdapter(myVideosArrayList)
        recyclerViewMyVideos.adapter = adapter
    }
}