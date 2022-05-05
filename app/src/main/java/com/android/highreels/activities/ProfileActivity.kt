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
        val profileItems = ArrayList<ProfileResponse>()
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        profileItems.add(ProfileResponse(R.drawable.kimsoohyun))
        profileItems.add(ProfileResponse(R.drawable.kimsoohyun))
        profileItems.add(ProfileResponse(R.drawable.kimsoohyun))
        profileItems.add(ProfileResponse(R.drawable.kimsoohyun))
        profileItems.add(ProfileResponse(R.drawable.kimsoohyun))
        profileItems.add(ProfileResponse(R.drawable.kimsoohyun))
        profileItems.add(ProfileResponse(R.drawable.kimsoohyun))
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        profileItems.add(ProfileResponse(R.drawable.kimsoohyun))
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        profileItems.add(ProfileResponse(R.drawable.kimsoohyun))
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        profileItems.add(ProfileResponse(R.drawable.kimsoohyun))
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        profileItems.add(ProfileResponse(R.drawable.kimsoohyun))
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        profileItems.add(ProfileResponse(R.drawable.kimsoohyun))
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        profileItems.add(ProfileResponse(R.drawable.kimsoohyun))
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        profileItems.add(ProfileResponse(R.drawable.kimsoohyun))
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        profileItems.add(ProfileResponse(R.drawable.chaeunwoo))
        recyclerViewProfile.adapter = ProfileAdapter(this, profileItems)
    }
}