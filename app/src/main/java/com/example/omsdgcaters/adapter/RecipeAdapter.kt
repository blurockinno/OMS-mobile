package com.example.omsdgcaters.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.omsdgcaters.R

class RecipeAdapter(private val recipeList: List<String>) : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recipe_item_layout, parent, false)
        return RecipeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val currentItem = recipeList[position]
        holder.recipeName.text = currentItem
//        holder.recipeType.text = currentItem.type
//        holder.recipeId.text = currentItem.id.toString()
        holder.actionButton.setOnClickListener {
            // Handle action button click here
        }
    }

    override fun getItemCount() = recipeList.size

    class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val recipeName: TextView = itemView.findViewById(R.id.recipe_name)
//        val recipeType: TextView = itemView.findViewById(R.id.recipe_type)
//        val recipeId: TextView = itemView.findViewById(R.id.recipe_id)
        val actionButton: ImageButton = itemView.findViewById(R.id.btn_edit)
    }
}
