package com.example.spacelocations.models.Position

import com.example.spacelocations.fragments.Categories

data class MarkerModel(
    val position: Position,
    val title: String,
    val description: String,
    val category: Categories
)