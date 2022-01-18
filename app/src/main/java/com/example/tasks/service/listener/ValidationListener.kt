package com.example.tasks.service.listener

class ValidationListener(str: String = "") {
    private var mStatus: Boolean = true
    private var mMessagen: String = ""

    init {
        if (str!= ""){
            mStatus = false
            mMessagen = str
        }
    }

    fun success() = mStatus
    fun failure() = mMessagen
}