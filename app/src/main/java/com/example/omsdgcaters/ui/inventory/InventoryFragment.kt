package com.example.omsdgcaters.ui.inventory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.omsdgcaters.adapter.InventoryAdapter
import com.example.omsdgcaters.databinding.FragmentInventoryBinding

class InventoryFragment : Fragment() {

    private var _binding: FragmentInventoryBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: InventoryAdapter

    // ViewModel initialization using viewModels delegate
    private val inventoryViewModel: InventoryViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInventoryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Initialize RecyclerView and set up adapter
        recyclerView = binding.recyclerViewInventory
        recyclerView.layoutManager = LinearLayoutManager(activity)
        adapter = InventoryAdapter(getDummyItemList()) // Pass dummy data to the adapter
        recyclerView.adapter = adapter

        // Observe LiveData from ViewModel
//        val textView: TextView = binding.textInventory
//        inventoryViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    // Function to generate dummy item list
    private fun getDummyItemList(): List<String> {
        // Replace this with your actual inventory data retrieval logic
        return listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10")
    }
}
