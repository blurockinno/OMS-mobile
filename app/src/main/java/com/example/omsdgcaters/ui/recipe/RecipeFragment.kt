package com.example.omsdgcaters.ui.recipe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.omsdgcaters.R
import com.example.omsdgcaters.adapter.RecipeAdapter
import com.example.omsdgcaters.databinding.FragmentInventoryBinding
import com.example.omsdgcaters.databinding.FragmentRecipeBinding
import com.example.omsdgcaters.ui.inventory.InventoryViewModel

class RecipeFragment : Fragment() {

    private var _binding: FragmentRecipeBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RecipeAdapter

    // Initialize RecipeViewModel using viewModels delegate
    private val recipeViewModel: RecipeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecipeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        recyclerView = binding.recyclerViewRecipe
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = RecipeAdapter(getRecipeList()) // Initialize adapter with an empty list initially
        recyclerView.adapter = adapter

        // navigate to add new recipe
        val btnAddNewRecipe = binding.btnAddRecipe
        btnAddNewRecipe.setOnClickListener {
            findNavController().navigate(R.id.action_add_new_recipe)
        }



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun getRecipeList(): List<String> {
        // Replace this with your actual inventory data retrieval logic
        return listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10")
    }
}