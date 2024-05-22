package com.example.omsdgcaters.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.omsdgcaters.R

class CustomerAdapter(private val customerName: List<String>): RecyclerView.Adapter<CustomerAdapter.CustomerViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ):CustomerViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.customer_history_layout, parent, false)
        return CustomerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CustomerViewHolder, position: Int) {
        val currentItem = customerName[position]
        holder.customerName.text =  currentItem
    }

    override fun getItemCount() = customerName.size

    class CustomerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val customerName: TextView = itemView.findViewById(R.id.customer_name)
    }
}


