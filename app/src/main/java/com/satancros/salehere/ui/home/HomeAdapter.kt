package com.satancros.salehere.ui.home

import android.content.Context
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.satancros.salehere.constants.Constant
import com.satancros.salehere.R
import com.satancros.salehere.extensions.inflate

class HomeAdapter(
    private val items: ArrayList<HomeModel.ViewModel.HomeAdapter>
) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val view = parent.inflate(R.layout.view_digi_goal)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.img.setImageResource(items[position].image)
        holder.discount.text = context.getString(R.string.amount_thb, items[position].discount)
        holder.amount.text = context.getString(R.string.amount_thb, items[position].amount)
        holder.progressBar.max = 100
        holder.progressBar.progress = items[position].progressBar
        holder.title.text = items[position].title
        holder.status.text = items[position].status.status

        when (items[position].status) {
            Constant.Status.GOOD -> {
                holder.rootCard.setBackgroundResource(R.drawable.goal_green_layout)
                holder.status.setTextColor(Color.parseColor(Constant.Status.GOOD.color))
            }
            Constant.Status.UNHAPPY -> {
                holder.rootCard.setBackgroundResource(R.drawable.goal_red_layout)
                holder.status.setTextColor(Color.parseColor(Constant.Status.UNHAPPY.color))
            }
        }

        holder.day.text = context.getString(R.string.day_left, items[position].day)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val rootCard: LinearLayout = view.findViewById(R.id.root_card)
        var img: ImageView = view.findViewById(R.id.img_icon)
        var discount: TextView = view.findViewById(R.id.text_discount)
        var amount: TextView = view.findViewById(R.id.text_amount)
        var progressBar: ProgressBar = view.findViewById(R.id.progressBar)
        var title: TextView = view.findViewById(R.id.text_title)
        var status: TextView = view.findViewById(R.id.text_status)
        var day: TextView = view.findViewById(R.id.text_day)
    }
}