package com.example.exerciserecyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class JobHero (
    val imgjobHero: Int,
    val namajobhero: String,
    val deksripsiJob: String
) : Parcelable