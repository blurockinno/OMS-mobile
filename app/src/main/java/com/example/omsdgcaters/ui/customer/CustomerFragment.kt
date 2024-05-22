package com.example.omsdgcaters.ui.customer

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.omsdgcaters.R
import com.example.omsdgcaters.adapter.CustomerAdapter
import com.example.omsdgcaters.adapter.PurchaseAdapter
import com.example.omsdgcaters.databinding.FragmentCustomerBinding
import com.example.omsdgcaters.databinding.FragmentInventoryBinding
import com.example.omsdgcaters.ui.inventory.InventoryViewModel

class CustomerFragment : Fragment() {

    private  var _binding: FragmentCustomerBinding? = null

    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CustomerAdapter



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val inventoryViewModel =  ViewModelProvider(this).get(CustomerViewModel::class.java)

        _binding = FragmentCustomerBinding.inflate(inflater, container, false)

        val root: View = binding.root

        recyclerView =  binding.recyclerViewCustomersHistory
        recyclerView.layoutManager =  LinearLayoutManager(requireContext())
        adapter = CustomerAdapter(customerDetails())
        recyclerView.adapter =  adapter

//        val textView: TextView =  binding.textCustomer
//        inventoryViewModel.text.observe(viewLifecycleOwner){
//            textView.text = it
//        }
        return root
    }

    private fun customerDetails(): List<String> {
        return listOf("Bhagwan Biruly", "Biruly", "Biru", "Akash Shrotiya", "Mangal", "Ravi tejja", "Allu Arjun", "Arjun", "Kishn", "John")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}