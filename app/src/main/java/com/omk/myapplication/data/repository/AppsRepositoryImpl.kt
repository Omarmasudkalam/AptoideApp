package com.omk.myapplication.data.repository

import com.omk.myapplication.data.remote.RemoteDataSet
import com.omk.myapplication.domain.model.AppDetails
import com.omk.myapplication.domain.repository.AppsRepository
import com.omk.myapplication.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AppsRepositoryImpl @Inject constructor(
    private val remoteDataSet: RemoteDataSet
): AppsRepository {
    override suspend fun getDataFromRemoteDataSource(): Flow<Resource<List<AppDetails>>> {
        return  remoteDataSet.getAppsInfo()
    }
}