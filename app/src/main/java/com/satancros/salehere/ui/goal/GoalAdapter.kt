package com.satancros.salehere.ui.goal

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.satancros.salehere.R
import com.satancros.salehere.extensions.inflate

class GoalAdapter(
    private val items: ArrayList<GoalModel.ViewModel.GoalAdapter>
) : RecyclerView.Adapter<GoalAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = parent.inflate(R.layout.view_goal)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = items[position].text
        holder.img.setImageResource(items[position].image)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var img: ImageView = view.findViewById(R.id.img_icon)
        var title: TextView = view.findViewById(R.id.text_title)
    }
}