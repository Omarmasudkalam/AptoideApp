package com.omk.myapplication.data.remote.dto


import com.google.gson.annotations.SerializedName

data class InfoDtoX(
    @SerializedName("status")
    val status: String,
    @SerializedName("time")
    val time: TimeDto
)