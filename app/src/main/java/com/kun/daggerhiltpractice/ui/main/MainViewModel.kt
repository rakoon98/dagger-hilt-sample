package com.kun.daggerhiltpractice.ui.main

import androidx.lifecycle.ViewModel
import com.kun.daggerhiltpractice.data.CommonRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repository : CommonRepository
) : ViewModel() {
    fun getRepositoryHash() :  String = repository.toString()
}