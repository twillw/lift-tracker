package com.tomwark.lifttracker.dataaccess

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tomwark.lifttracker.dataaccess.dao.ExerciseDao
import com.tomwark.lifttracker.dataaccess.entities.Exercise

@Database(entities = arrayOf(Exercise::class), version = 1)
abstract class WorkoutDatabase : RoomDatabase() {
    abstract fun exerciseDao(): ExerciseDao
}