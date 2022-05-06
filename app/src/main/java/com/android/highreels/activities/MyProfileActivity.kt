package com.android.highreels.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.android.highreels.R
import com.android.highreels.Toast.MDToast
import com.android.highreels.adapters.ProfileAdapter
import com.android.highreels.responseModels.ProfileResponse
import kotlinx.android.synthetic.main.activity_my_profile.*

class MyProfileActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_my_profile)
        initRecyclerView()
        initListeners()
    }

    private fun initListeners() {
        imageViewAddFriend.setOnClickListener(this)
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

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.imageViewAddFriend -> {
                MDToast.makeText(this, "Adding Friend", MDToast.LENGTH_LONG).show()
            }
        }
    }
}