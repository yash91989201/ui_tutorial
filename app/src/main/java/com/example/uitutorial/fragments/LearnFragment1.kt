package com.example.uitutorial.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uitutorial.R
import com.example.uitutorial.databinding.FragmentLearn1Binding

class LearnFragment1 : Fragment() {

    private lateinit var binding:FragmentLearn1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentLearn1Binding.inflate(layoutInflater)
        return binding.root
    }

    companion object {

    }
}