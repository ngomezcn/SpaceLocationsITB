package com.example.spacelocations.fragments

import android.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.spacelocations.adapter.RecyclerAdapter
import com.example.spacelocations.databinding.FragmentRecyclerBinding
import com.example.spacelocations.viewmodel.ViewModel


class RecyclerFragment : Fragment() {

    lateinit var binding: FragmentRecyclerBinding
    private lateinit var launchAdapter: RecyclerAdapter
    private val viewModel: ViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentRecyclerBinding.inflate(layoutInflater)

        setHasOptionsMenu(true);//Make sure you have this line of code.
        return binding.root
    }

    private fun setUpRecyclerView() {
        launchAdapter = RecyclerAdapter(viewModel.markerList.value!!)
        binding.recyclerView.apply {
            setHasFixedSize(true) //Optimitza el rendiment de l’app
            layoutManager = GridLayoutManager(context, 1)
            adapter = launchAdapter
        }
    }

    @Deprecated("Deprecated in Java", ReplaceWith(
        "super.onOptionsItemSelected(item)",
        "androidx.fragment.app.Fragment"
    )
    )

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> {
                findNavController().navigate(com.example.spacelocations.R.id.recycler_to_map)
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onResume() {
        setUpRecyclerView()
        super.onResume()
    }
}