package com.example.omsdgcaters.ui.inventory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.omsdgcaters.databinding.FragmentAddNewInventoryBinding

class AddNewInventory : Fragment() {

    private var _binding: FragmentAddNewInventoryBinding? = null
    private val binding  get() =  _binding!!

    private val viewModel: AddNewInventoryViewModel by viewModels()

    private val categories = arrayOf("Tent", "Catering", "Bedding", "Light", "Decoration")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding =  FragmentAddNewInventoryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Setup the dropdown items

        val categoryDropdown = binding.categoryDropdown
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_dropdown_item_1line, categories)
        categoryDropdown.setAdapter(adapter)

        // Handle the submit button click
        binding.submitButton.setOnClickListener {
            val itemName = binding.itemNameLayout.editText?.text.toString()
            val quantity = binding.quantityLayout.editText?.text.toString()
            val size = binding.sizeLayout.editText?.text.toString()
            val selectedCategory = categoryDropdown.text.toString()
            val isConsumable = binding.consumableCheckbox.isChecked

            // You can handle the collected data here, for example, display a toast
            val message = "Item Name: $itemName\nQuantity: $quantity\nSize: $size\nCategory: $selectedCategory\nIs Consumable: $isConsumable"
            Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show()
        }



        return root
    }
}