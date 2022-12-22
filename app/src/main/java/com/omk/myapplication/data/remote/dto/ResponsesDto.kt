package com.omk.myapplication.data.remote.dto


import com.google.gson.annotations.SerializedName

data class ResponsesDto(
    @SerializedName("listApps")
    val listApps: ListAppsDto
)