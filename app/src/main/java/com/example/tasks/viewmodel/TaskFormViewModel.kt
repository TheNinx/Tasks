package com.example.tasks.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.tasks.service.listener.ValidationListener
import com.example.tasks.service.model.PriorityModel
import com.example.tasks.service.repository.Priorityrepository

class TaskFormViewModel(application: Application) : AndroidViewModel(application) {
    private val mPriorityrepository = Priorityrepository(application)

    private val mPriorityList = MutableLiveData<List<PriorityModel>>()
    var priorities: LiveData<List<PriorityModel>> = mPriorityList

    fun listPriorities() {
        mPriorityList.value = mPriorityrepository.list()
    }


}