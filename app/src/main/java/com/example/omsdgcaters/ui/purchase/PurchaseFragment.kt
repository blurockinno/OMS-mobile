package com.example.omsdgcaters.ui.purchase

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
import com.example.omsdgcaters.adapter.PurchaseAdapter
import com.example.omsdgcaters.databinding.FragmentPurchaseBinding
import com.example.omsdgcaters.ui.customer.CustomerViewModel

class PurchaseFragment : Fragment() {

    private var _binding: FragmentPurchaseBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PurchaseAdapter
    private val purchaseViewModel : CustomerViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(PurchaseViewModel::class.java)

        _binding = FragmentPurchaseBinding.inflate(inflater, container, false)
        val root: View = binding.root

        recyclerView =  binding.recyclerViewOrderPurchase
        recyclerView.layoutManager =  LinearLayoutManager(requireContext())
        adapter =  PurchaseAdapter(purchaseDetails())
        recyclerView.adapter =  adapter
//        val textView: TextView = binding.textNotifications
//        notificationsViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    private fun purchaseDetails(): List<String> {
        return listOf("Bhagwan Biruly", "Biruly", "Biru", "Akash Shrotiya", "Mangal", "Ravi tejja", "Allu Arjun", "Arjun", "Kishn", "John")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}