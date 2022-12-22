package com.omk.myapplication.data.remote.dto


import com.google.gson.annotations.SerializedName

data class DataDto(
    @SerializedName("hidden")
    val hidden: Int,
    @SerializedName("limit")
    val limit: Int,
    @SerializedName("list")
    val list: List<Dto>,
    @SerializedName("next")
    val next: Int,
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("total")
    val total: Int
)