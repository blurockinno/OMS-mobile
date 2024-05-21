package com.example.omsdgcaters.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.omsdgcaters.R

class InventoryAdapter(private val itemList: List<String>) : RecyclerView.Adapter<InventoryAdapter.InventoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InventoryViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.inventory_item_layout, parent, false)
        return InventoryViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: InventoryViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.itemName.text = currentItem
    }

    override fun getItemCount() = itemList.size

    class InventoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemName: TextView = itemView.findViewById(R.id.item_name)
    }
}
