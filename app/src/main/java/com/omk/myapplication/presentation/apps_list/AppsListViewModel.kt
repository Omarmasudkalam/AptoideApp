package com.omk.myapplication.presentation.apps_list

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omk.myapplication.domain.use_case.GetAppsList
import com.omk.myapplication.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class AppsListViewModel @Inject constructor(
    private val getAppsList: GetAppsList
) :ViewModel(){

    private val _appsListState:MutableState<AppsListState> = mutableStateOf(AppsListState())
    val appsListState:State<AppsListState> get() = _appsListState

    init {
        getApps()
    }

    private fun getApps() {
       viewModelScope.launch {
           getAppsList().collect{
               when(it){
                   is Resource.Loading -> _appsListState.value = AppsListState(isLoading = true)
                   is Resource.Error -> _appsListState.value = AppsListState(error = it.message)
                   is Resource.Success ->{
                       val returnedList  = it.data
                       _appsListState.value = AppsListState(editorPick = returnedList!!.subList(0,10), apps = returnedList.slice(
                           11 until returnedList.size
                       ))
                   }
               }
           }
       }
    }
}