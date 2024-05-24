package com.example.omsdgcaters.ui.recipe

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.omsdgcaters.R
import com.example.omsdgcaters.databinding.FragmentAddNewRecipeBinding

class AddNewRecipe : Fragment() {

    private  var _binding : FragmentAddNewRecipeBinding? =  null
    private val binding  get() = _binding!!

    private val viewModel: AddNewRecipeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding =  FragmentAddNewRecipeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }
}