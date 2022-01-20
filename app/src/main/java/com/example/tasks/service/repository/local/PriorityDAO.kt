package com.example.tasks.service.repository.local;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query

import com.example.tasks.service.model.PriorityModel;
import retrofit2.http.DELETE


@Dao
interface PriorityDAO {

    @Insert
    fun save(list: kotlin.collections.List<PriorityModel>)


    @Query("SELECT * FROM priority")
    fun list(): List<PriorityModel>

    @Query("SELECT description FROM priority WHERE id = :id")
    fun getDescription(id: Int):String

    @Query("DELETE FROM priority")
    fun clear()
}
