package com.android.highreels.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.highreels.R
import com.android.highreels.customViewRegular.RegularButton
import com.android.highreels.customViewSemiBold.SemiBoldTextView
import com.android.highreels.responseModels.shareToResponse
import com.google.android.material.imageview.ShapeableImageView

class ShareAdapter constructor(

    private val mList: ArrayList<shareToResponse>
) :
    RecyclerView.Adapter<ShareAdapter.ShareViewHolder>() {

    class ShareViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        val shareButton: RegularButton
        val imageViewProfile: ShapeableImageView
        val textViewName: SemiBoldTextView

        init {
            imageViewProfile = itemView.findViewById(R.id.imageViewProfile)
            textViewName = itemView.findViewById(R.id.textViewName)
            shareButton = itemView.findViewById(R.id.shareButton)
            imageViewProfile.setOnClickListener(this)
        }

        override fun onClick(view: View?) {
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShareViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_share_to, parent, false)
        return ShareViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShareViewHolder, position: Int) {
        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        //holder.imageViewProfile.setImageURI("")

        // sets the text to the textview from our itemHolder class
        holder.textViewName.text = ItemsViewModel.text
        holder.shareButton.text = "Share"
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}