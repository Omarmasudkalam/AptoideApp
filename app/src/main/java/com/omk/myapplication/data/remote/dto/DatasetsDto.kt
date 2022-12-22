package com.omk.myapplication.data.remote.dto


import com.google.gson.annotations.SerializedName

data class DatasetsDto(
    @SerializedName("all")
    val all: AllDto
)