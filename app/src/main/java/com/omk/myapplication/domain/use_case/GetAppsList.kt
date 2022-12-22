package com.omk.myapplication.domain.use_case

import com.omk.myapplication.domain.repository.AppsRepository
import com.omk.myapplication.util.Resource
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetAppsList @Inject constructor(
    private val repository: AppsRepository
){
   suspend operator fun invoke() = flow {
       repository.getDataFromRemoteDataSource().collect{
           when(it){
               is Resource.Success ->
               {
                   val sortedList = it.data!!.sortedByDescending { it2->it2.downloads }
                   emit(Resource.Success(sortedList))
               }
               else -> emit(it)
           }
       }
   }
}