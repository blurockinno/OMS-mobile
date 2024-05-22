package com.example.omsdgcaters.ui.order

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
import com.example.omsdgcaters.adapter.OrderAdapter
import com.example.omsdgcaters.adapter.RecipeAdapter
import com.example.omsdgcaters.databinding.FragmentOrderBinding
import com.example.omsdgcaters.ui.customer.CustomerViewModel

class OrderFragment : Fragment() {

    private var _binding: FragmentOrderBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: OrderAdapter
    private  val customerViewModel: CustomerViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(OrderViewModel::class.java)

        _binding = FragmentOrderBinding.inflate(inflater, container, false)
        val root: View = binding.root


        recyclerView = binding.recyclerViewOrder
        recyclerView.layoutManager  = LinearLayoutManager(requireContext())
        adapter = OrderAdapter(getCustomerDetails())
        recyclerView.adapter =  adapter
//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    private fun getCustomerDetails(): List<String> {
        return listOf("Bhagwan Biruly", "Biruly", "Biru", "Akash Shrotiya", "Mangal", "Ravi tejja", "Allu Arjun", "Arjun", "Kishn", "John")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}