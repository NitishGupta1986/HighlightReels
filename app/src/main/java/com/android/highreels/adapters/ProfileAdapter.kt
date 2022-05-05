package com.android.highreels.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.highreels.R
import com.android.highreels.cornerRoundImage.RoundedImageView
import com.android.highreels.responseModels.ProfileResponse

class ProfileAdapter constructor(
    private val context: Context,
    private val mList: List<ProfileResponse>
) :
    RecyclerView.Adapter<ProfileAdapter.ShareViewHolder>() {

    class ShareViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        val roundImage: RoundedImageView

        init {
            roundImage = itemView.findViewById(R.id.roundImage)
            roundImage.setOnClickListener(this)
        }

        override fun onClick(view: View?) {
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShareViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_profile_videos, parent, false)
        return ShareViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShareViewHolder, position: Int) {
        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        //holder.imageViewProfile.setImageURI("")

        // sets the text to the textview from our itemHolder class
        //holder.textViewName.text = ItemsViewModel.text
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}