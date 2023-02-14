package com.example.spacelocations.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.spacelocations.R
import com.example.spacelocations.adapter.RecyclerViewAdapter
import com.example.spacelocations.databinding.FragmentAddMarkerBinding
import com.example.spacelocations.databinding.FragmentRecyclerBinding
import com.example.spacelocations.viewmodel.ViewModel


class RecyclerFragment : Fragment() {

    lateinit var binding: FragmentRecyclerBinding
    private lateinit var launchAdapter: RecyclerViewAdapter
    private val viewModel: ViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentRecyclerBinding.inflate(layoutInflater)

        setHasOptionsMenu(true);//Make sure you have this line of code.
        setUpRecyclerView()
        return binding.root
    }

    private fun setUpRecyclerView() {
        launchAdapter = RecyclerViewAdapter(viewModel.markerList.value!!)
        binding.recyclerView.apply {
            setHasFixedSize(true) //Optimitza el rendiment de l’app
            layoutManager = GridLayoutManager(context, 1)
            adapter = launchAdapter
        }
    }
}