package com.sokrat.resturantshotlines

import android.app.Activity
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView

class RestaurantAdapter(val activity: Activity, val restaurants : ArrayList<Restaurant>) : RecyclerView.Adapter<RestaurantAdapter.MVH>(){
    class MVH(view: View): RecyclerView.ViewHolder(view) {
        val parent: CardView = view.findViewById(R.id.card_view)
        val iv : ImageView = view.findViewById(R.id.image)
        val tv : TextView = view.findViewById(R.id.txt)
        val nv : TextView = view.findViewById(R.id.hotline)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantAdapter.MVH {
        val view = activity.layoutInflater.inflate(R.layout.resturant_list_item, parent, false)
        return MVH(view)
    }

    override fun onBindViewHolder(holder: RestaurantAdapter.MVH, position: Int) {
        holder.iv.setImageResource(restaurants[position].pic)
        holder.tv.text = restaurants[position].name
        holder.nv.text = restaurants[position].number
        holder.parent.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, "tel: ${restaurants[position].number}".toUri())
            activity.startActivity(i)
        }
    }

    override fun getItemCount() = restaurants.size


}