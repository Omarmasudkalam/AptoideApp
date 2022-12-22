package com.omk.myapplication.data.remote.dto


import com.google.gson.annotations.SerializedName

data class AllDto(
    @SerializedName("data")
    val `data`: DataDto,
    @SerializedName("info")
    val info: InfoDtoX
)