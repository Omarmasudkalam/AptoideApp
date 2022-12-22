package com.omk.myapplication.data.remote.dto


import com.google.gson.annotations.SerializedName

data class ResponseDto(
    @SerializedName("responses")
    val responses: ResponsesDto,
    @SerializedName("status")
    val status: String
)