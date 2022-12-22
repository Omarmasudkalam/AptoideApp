package com.omk.myapplication.domain.repository

import com.omk.myapplication.domain.model.AppDetails
import com.omk.myapplication.util.Resource
import kotlinx.coroutines.flow.Flow

interface AppsRepository {

 suspend fun getDataFromRemoteDataSource() : Flow<Resource<List<AppDetails>>>
}