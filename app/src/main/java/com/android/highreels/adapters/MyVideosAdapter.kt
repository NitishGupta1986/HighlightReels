package com.android.highreels.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.recyclerview.widget.RecyclerView
import com.android.highreels.R
import com.android.highreels.activities.MoreVideosActivity
import com.android.highreels.customViewRegular.RegularTextView
import com.android.highreels.responseModels.MyVideosResponse
import com.makeramen.roundedimageview.RoundedImageView

class MyVideosAdapter(
    private val mList: ArrayList<MyVideosResponse>
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var context: Context? = null

    class MyVideosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewVideoTitle: RegularTextView
        val imageViewVideoThumbmnail: RoundedImageView

        init {
            imageViewVideoThumbmnail = itemView.findViewById(R.id.imageViewVideoThumbmnail)
            textViewVideoTitle = itemView.findViewById(R.id.textViewVideoTitle)
        }
    }

    class ViewMoreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val relativeLayoutMoreVideos: RelativeLayout

        init {
            relativeLayoutMoreVideos = itemView.findViewById(R.id.relativeLayoutMoreVideos)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == mList.size) R.layout.more_videos else R.layout.item_my_videos
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val viewHolder: RecyclerView.ViewHolder
        context = parent.context
        if (viewType == R.layout.item_my_videos) {
            val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_my_videos, parent, false)
            viewHolder = MyVideosViewHolder(view)
        } else {
            val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.more_videos, parent, false)
            viewHolder = ViewMoreViewHolder(view)
        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (position == mList.size) {
            (holder as ViewMoreViewHolder).relativeLayoutMoreVideos.setOnClickListener {
                var intent = Intent(context, MoreVideosActivity::class.java)
                context?.startActivity(intent)
            }
        } else {
            val ItemsViewModel = mList[position]
            (holder as MyVideosViewHolder).textViewVideoTitle.text = ItemsViewModel.text
        }
        // sets the image to the imageview from our itemHolder class
        //holder.imageViewProfile.setImageURI("")

        // sets the text to the textview from our itemHolder class
        //holder.textViewName.text = ItemsViewModel.text
    }

    override fun getItemCount(): Int {
        return mList.size + 1
    }
}