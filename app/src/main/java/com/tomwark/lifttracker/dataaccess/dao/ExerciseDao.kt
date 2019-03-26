package com.tomwark.lifttracker.dataaccess.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.tomwark.lifttracker.dataaccess.entities.Exercise

@Dao
interface ExerciseDao {
    @Query("SELECT * FROM exercise")
    fun getAll(): List<Exercise>

    @Insert
    fun insert(exercise: Exercise)
}