package com.example.testeando

import androidx.annotation.DrawableRes

data class Camera (
    val titulo:String,
    val id:Int,
    @DrawableRes
    val img:Int?,
    @DrawableRes
    val icon:Int? = R.drawable.play
)