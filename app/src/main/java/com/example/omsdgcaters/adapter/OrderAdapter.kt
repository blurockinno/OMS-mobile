package com.example.omsdgcaters.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.omsdgcaters.R

class OrderAdapter(private val customerName: List<String>): RecyclerView.Adapter<OrderAdapter.OrderViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): OrderViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.order_view_layout, parent, false)
        return OrderViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: OrderAdapter.OrderViewHolder, position: Int) {
        val currentItem =  customerName[position]
        holder.customerName.text =  currentItem
    }

    override fun getItemCount() = customerName.size

    class OrderViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val customerName: TextView = itemView.findViewById(R.id.customer_name)
    }
}