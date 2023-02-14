package com.example.spacelocations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.spacelocations.databinding.ActivityMainBinding
import com.example.spacelocations.fragments.LoginFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        navController = findNavController(R.id.fragment_container_view)
    }
}