package com.example.omsdgcaters.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.omsdgcaters.R

class PurchaseAdapter(private val customerName: List<String>): RecyclerView.Adapter<PurchaseAdapter.PurchaseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PurchaseViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.purchase_order_item_layout, parent, false)
        return PurchaseViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PurchaseViewHolder, position: Int) {
        val currentItem = customerName[position]
        holder.customerName.text = currentItem
    }

    override fun getItemCount() = customerName.size

    class PurchaseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val customerName: TextView = itemView.findViewById(R.id.customer_name)
    }
}
