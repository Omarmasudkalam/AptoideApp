package com.omk.myapplication.data.remote

import com.omk.myapplication.data.remote.dto.ResponseDto
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {


    @GET(Companion.END_POINT)
   suspend fun getAppsList() : Response<ResponseDto>


    companion object{
        const val BASE_URL = "http://ws2.aptoide.com/"
        const val END_POINT = "api/6/bulkRequest/api_list/listApps"
    }
}