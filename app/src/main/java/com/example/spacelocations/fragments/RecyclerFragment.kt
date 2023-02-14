package com.example.spacelocations.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.spacelocations.R
import com.example.spacelocations.databinding.FragmentAddMarkerBinding
import com.example.spacelocations.databinding.FragmentRecyclerBinding


class RecyclerFragment : Fragment() {

    lateinit var binding: FragmentRecyclerBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentRecyclerBinding.inflate(layoutInflater)

        return binding.root
    }
}