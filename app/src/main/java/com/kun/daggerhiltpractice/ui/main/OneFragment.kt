package com.kun.daggerhiltpractice.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kun.daggerhiltpractice.R
import com.kun.daggerhiltpractice.data.CommonRepository
import com.kun.daggerhiltpractice.ui.sub.SubActivity
import kotlinx.android.synthetic.main.fragment_one.*
import javax.inject.Inject

class OneFragment : Fragment() {

    @Inject
    lateinit var repository : CommonRepository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_activity.setOnClickListener {
            startActivity(Intent(activity, SubActivity::class.java))
        }

        button_fragment.setOnClickListener {
            findNavController().navigate(R.id.action_one_to_two)
        }
    }

}