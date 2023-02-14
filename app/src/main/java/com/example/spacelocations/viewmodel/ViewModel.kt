package com.example.spacelocations.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.spacelocations.models.Position.MarkerModel
import com.example.spacelocations.models.Position.Position

class ViewModel : ViewModel() {
    var markerList = MutableLiveData<MutableList<MarkerModel>>(mutableListOf())


    init {
    }
}