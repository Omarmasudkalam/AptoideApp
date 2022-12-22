package com.omk.myapplication.data.remote

import com.omk.myapplication.domain.model.AppDetails
import com.omk.myapplication.util.Resource
import kotlinx.coroutines.flow.Flow


interface RemoteDataSet {

   suspend fun getAppsInfo(): Flow<Resource<List<AppDetails>>>
}