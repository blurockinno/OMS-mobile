package com.example.omsdgcaters.ui.customer

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.omsdgcaters.R
import com.example.omsdgcaters.databinding.FragmentCustomerBinding
import com.example.omsdgcaters.databinding.FragmentInventoryBinding
import com.example.omsdgcaters.ui.inventory.InventoryViewModel

class CustomerFragment : Fragment() {

    private  var _binding: FragmentCustomerBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val inventoryViewModel =  ViewModelProvider(this).get(CustomerViewModel::class.java)

        _binding = FragmentCustomerBinding.inflate(inflater, container, false)

        val root: View = binding.root

        val textView: TextView =  binding.textCustomer
        inventoryViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}