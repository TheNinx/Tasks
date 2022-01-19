package com.example.tasks.service.listener



interface APIListener<T> {

    fun onSuccess(model: T)


    fun onFailure(toString: String)



}