package com.omk.myapplication.data.remote.dto


import com.google.gson.annotations.SerializedName

data class ListAppsDto(
    @SerializedName("datasets")
    val datasets: DatasetsDto,
    @SerializedName("info")
    val info: InfoDtoX
)