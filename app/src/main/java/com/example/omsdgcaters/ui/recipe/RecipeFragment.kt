package com.example.omsdgcaters.ui.recipe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.omsdgcaters.R
import com.example.omsdgcaters.databinding.FragmentInventoryBinding
import com.example.omsdgcaters.databinding.FragmentRecipeBinding
import com.example.omsdgcaters.ui.inventory.InventoryViewModel

class RecipeFragment : Fragment() {

    private  var _binding: FragmentRecipeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val inventoryViewModel =  ViewModelProvider(this).get(RecipeViewModel::class.java)

        _binding = FragmentRecipeBinding.inflate(inflater, container, false)

        val root: View = binding.root

        val textView: TextView =  binding.textRecipe
        inventoryViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }
        return root
    }
}