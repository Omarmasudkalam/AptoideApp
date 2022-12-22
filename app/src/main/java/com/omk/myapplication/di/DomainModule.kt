package com.omk.myapplication.di

import com.omk.myapplication.data.remote.ApiService
import com.omk.myapplication.data.remote.RemoteDataSet
import com.omk.myapplication.data.remote.RemoteDataSetImpl
import com.omk.myapplication.data.repository.AppsRepositoryImpl
import com.omk.myapplication.domain.repository.AppsRepository
import com.omk.myapplication.domain.use_case.GetAppsList
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object DomainModule {
    @Provides
    fun providesRemoteDataSet(apiService: ApiService):RemoteDataSet = RemoteDataSetImpl(apiService)

    @Provides
    fun providesAppsRepository(remoteDataSet: RemoteDataSet):AppsRepository = AppsRepositoryImpl(remoteDataSet)

    @Provides
    fun providesGetAppsListUseCase(repository: AppsRepository):GetAppsList= GetAppsList(repository)
}