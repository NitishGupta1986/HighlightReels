package com.android.highreels.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.highreels.R
import com.android.highreels.customViewBold.BoldTextView
import com.android.highreels.customViewRegular.RegularTextView
import com.android.highreels.responseModels.MoreVideosResponse
import com.makeramen.roundedimageview.RoundedImageView

class MoreVideosAdapter constructor(

    private val mList: ArrayList<MoreVideosResponse>
) :
    RecyclerView.Adapter<MoreVideosAdapter.MoreVideosViewHolder>() {

    class MoreVideosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        val textViewTimeAgo: RegularTextView
        val imageViewUser: RoundedImageView
        val textViewName: BoldTextView

        init {
            imageViewUser = itemView.findViewById(R.id.imageViewUser)
            textViewName = itemView.findViewById(R.id.textViewName)
            textViewTimeAgo = itemView.findViewById(R.id.textViewTimeAgo)
            imageViewUser.setOnClickListener(this)
        }

        override fun onClick(view: View?) {
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoreVideosViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_more_videos, parent, false)
        return MoreVideosViewHolder(view)
    }

    override fun onBindViewHolder(holder: MoreVideosViewHolder, position: Int) {
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