package com.example.fruit_app

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Fruit (
    val Name: String,
    val Image: Int,
    val Desc: String?
) : Parcelable

