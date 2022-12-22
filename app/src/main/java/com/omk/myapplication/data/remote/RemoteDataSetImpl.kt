package com.omk.myapplication.data.remote

import com.omk.myapplication.domain.model.AppDetails
import com.omk.myapplication.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class RemoteDataSetImpl @Inject constructor(
    private val apiService: ApiService
) : RemoteDataSet{
    override suspend fun getAppsInfo(): Flow<Resource<List<AppDetails>>> = flow {
        emit(Resource.Loading())
        try {
            val response = apiService.getAppsList()
            if(response.isSuccessful){
               when(val body = response.body()){
                   null -> emit(Resource.Error("Empty response body"))
                   else -> emit(Resource.Success(body.responses.listApps.datasets.all.data.list.map { it.toAppDetails() }))
               }
            }else throw HttpException(response)
        }catch (e:HttpException){
            val code = e.code()
            emit(Resource.Error("Request failed with code: $code"))
        }catch (e:IOException){
            emit(Resource.Error("Check your Internet Connection"))
        }

    }
}