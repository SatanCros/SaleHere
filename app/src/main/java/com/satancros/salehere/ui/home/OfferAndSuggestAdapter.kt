package com.satancros.salehere.ui.home

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.satancros.salehere.R
import com.satancros.salehere.extensions.inflate
import java.util.ArrayList

class OfferAndSuggestAdapter(
    private val items: ArrayList<Int>
) : RecyclerView.Adapter<OfferAndSuggestAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val view = parent.inflate(R.layout.view_offer)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.number.text = (position + 1).toString()
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val number: TextView = view.findViewById(R.id.text_number)
    }
}