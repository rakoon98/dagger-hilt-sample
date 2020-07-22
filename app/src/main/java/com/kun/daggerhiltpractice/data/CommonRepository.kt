package com.kun.daggerhiltpractice.data

import javax.inject.Inject
import kotlin.random.Random


class CommonRepository @Inject constructor(

){
    val randomInt : Int
        get() = Random.nextInt(1,50000)+1

}