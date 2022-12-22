package com.omk.myapplication.data.remote.dto


import com.google.gson.annotations.SerializedName

data class TimeDto(
    @SerializedName("human")
    val human: String,
    @SerializedName("seconds")
    val seconds: Double
)