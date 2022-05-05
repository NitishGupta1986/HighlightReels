package com.android.highreels.activities

import android.graphics.PorterDuff
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.highreels.R
import com.android.highreels.adapters.ShareAdapter
import com.android.highreels.interfaces.ClickListener
import com.android.highreels.responseModels.shareToResponse
import kotlinx.android.synthetic.main.activity_share.*

class ShareActivity : AppCompatActivity(), ClickListener, View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_share)
        supportActionBar?.customView = materialToolBar
        val upArrow = resources.getDrawable(R.drawable.ic_arrow_back_black_24dp)
        upArrow.setColorFilter(resources.getColor(android.R.color.white), PorterDuff.Mode.SRC_ATOP)
        supportActionBar!!.setHomeAsUpIndicator(upArrow)
        initRecyclerView()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                super.onOptionsItemSelected(item)
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun initRecyclerView() {
        recyclerViewShare.layoutManager = LinearLayoutManager(this)
        val shareToResponseArrayList = ArrayList<shareToResponse>()
        for (i in 1..20) {
            shareToResponseArrayList.add(
                shareToResponse(
                    "https://api.androidhive.info/images/glide/medium/deadpool.jpg",
                    "Name " + i
                )
            )
            //adapter.setOnItemClickListener(this)
        }
        val adapter = ShareAdapter(shareToResponseArrayList)
        recyclerViewShare.adapter = adapter
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    override fun onItemClick(position: Int, v: View?) {
    }

    override fun onClick(p0: View?) {
        finish()
    }
}