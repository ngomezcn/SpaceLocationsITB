package com.example.spacelocations.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.spacelocations.models.Position.MarkerModel
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.spacelocations.R
import com.example.spacelocations.databinding.ItemLayoutBinding

class RecyclerAdapter (private var markers: List<MarkerModel>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        println(markers[position])

        val marker = markers[position]
        with(holder){



            binding.positionTextView.text = "Lat: ${"%.2f".format(marker.position.latitude)} Long: ${"%.2f".format(marker.position.longitude)}"
            binding.titleTextView.text = marker.title
        }
    }

    override fun getItemCount(): Int {
        return markers.size
    }

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val binding = ItemLayoutBinding.bind(view)
    }
}