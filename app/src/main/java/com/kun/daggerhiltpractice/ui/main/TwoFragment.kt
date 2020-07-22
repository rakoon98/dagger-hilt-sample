package com.kun.daggerhiltpractice.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kun.daggerhiltpractice.R
import com.kun.daggerhiltpractice.data.CommonRepository
import kotlinx.android.synthetic.main.fragment_two.*
import javax.inject.Inject

class TwoFragment : Fragment() {

    @Inject
    lateinit var repository : CommonRepository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_two_to_one)
        }
    }

}