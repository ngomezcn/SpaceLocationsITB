package com.example.spacelocations.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.spacelocations.models.Position.MarkerModel
import com.example.spacelocations.models.Position.Position
import kotlin.random.Random

class ViewModel : ViewModel() {
    var markerList = MutableLiveData<MutableList<MarkerModel>>(mutableListOf(
        /*MarkerModel(
            //Position(41.4534227,2.1841046),
            Position(Random.nextDouble(0.0, 40.0) , Random.nextDouble(0.0, 40.0) ),
            binding.titleEditText.text.toString(),
            binding.descriptionEditText.text.toString(),
            cate
        )*/
    ))

    init {
    }
}