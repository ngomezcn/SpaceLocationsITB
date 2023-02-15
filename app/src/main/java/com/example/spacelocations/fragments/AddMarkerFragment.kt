package com.example.spacelocations.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.spacelocations.R
import com.example.spacelocations.databinding.FragmentAddMarkerBinding
import com.example.spacelocations.models.Position.MarkerModel
import com.example.spacelocations.models.Position.Position
import com.example.spacelocations.viewmodel.ViewModel
import kotlin.random.Random


enum class Categories(private val category: String) {
    LifOff( "Lift Off"),
    PrimaryStage("Primary Stage"),
    SecondaryStage("Secondary Stage"),
    Payload("Payload");
    override fun toString(): String {
        return category
    }
}

class AddMarkerFragment : Fragment() {
    lateinit var binding: FragmentAddMarkerBinding
    private val viewModel: ViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAddMarkerBinding.inflate(layoutInflater)
        binding.cameraCaptureButton.setOnClickListener {

            var category : Categories? = null
            when(binding.categoriesSpinner.selectedItem.toString()){
                 "Lift Off" -> category = Categories.LifOff
                 "Primary Stage" -> category = Categories.PrimaryStage
                 "Secondary Stage" -> category = Categories.SecondaryStage
                 "Payload" -> category = Categories.Payload
            }

            val marker = MarkerModel(
                //Position(41.4534227,2.1841046),
                Position(Random.nextDouble(0.0, 40.0) , Random.nextDouble(0.0, 40.0) ),
                binding.titleEditText.text.toString(),
                binding.descriptionEditText.text.toString(),
                category!!
            )

            viewModel.markerList.value!!.add(marker)

           findNavController().navigate(R.id.addmarker_to_map)
        }

        return binding.root
    }


}