package com.example.omsdgcaters.ui.term_conditions

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.omsdgcaters.R

class TermAndConditionFragment : Fragment() {

    companion object {
        fun newInstance() = TermAndConditionFragment()
    }

    private val viewModel: TermAndConditionViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_term_and_condition, container, false)
    }
}