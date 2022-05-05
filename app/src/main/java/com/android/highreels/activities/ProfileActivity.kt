package com.android.highreels.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.android.highreels.R
import com.android.highreels.adapters.ProfileAdapter
import com.android.highreels.responseModels.ProfileResponse
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_profile)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        recyclerViewProfile.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val profileItems: MutableList<ProfileResponse> = mutableListOf()
        profileItems.add(ProfileResponse("https://api.androidhive.info/images/glide/medium/deadpool.jpg"))
        profileItems.add(ProfileResponse("https://api.androidhive.info/images/glide/medium/deadpool.jpg"))
        profileItems.add(ProfileResponse("https://api.androidhive.info/images/glide/medium/deadpool.jpg"))
        profileItems.add(ProfileResponse("https://api.androidhive.info/images/glide/medium/deadpool.jpg"))
        profileItems.add(ProfileResponse("https://api.androidhive.info/images/glide/medium/deadpool.jpg"))
        profileItems.add(ProfileResponse("https://api.androidhive.info/images/glide/medium/deadpool.jpg"))
        profileItems.add(ProfileResponse("https://api.androidhive.info/images/glide/medium/deadpool.jpg"))
        profileItems.add(ProfileResponse("https://api.androidhive.info/images/glide/medium/deadpool.jpg"))
        profileItems.add(ProfileResponse("https://api.androidhive.info/images/glide/medium/deadpool.jpg"))
        profileItems.add(ProfileResponse("https://api.androidhive.info/images/glide/medium/deadpool.jpg"))
        profileItems.add(ProfileResponse("https://api.androidhive.info/images/glide/medium/deadpool.jpg"))
        profileItems.add(ProfileResponse("https://api.androidhive.info/images/glide/medium/deadpool.jpg"))
        profileItems.add(ProfileResponse("https://api.androidhive.info/images/glide/medium/deadpool.jpg"))
        recyclerViewProfile.adapter = ProfileAdapter(this, profileItems)

    }
}