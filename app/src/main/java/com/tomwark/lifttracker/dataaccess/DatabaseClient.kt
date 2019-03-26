package com.tomwark.lifttracker.dataaccess

import androidx.room.Room
import com.tomwark.lifttracker.LiftTrackerApplication

object DatabaseClient {

    private var _connection: WorkoutDatabase? = null
    val connection: WorkoutDatabase
        get() {
            if (_connection == null) {
                _connection = Room.databaseBuilder(
                    LiftTrackerApplication.instance,
                    WorkoutDatabase::class.java, "workout-database"
                ).build()
            }
            return _connection!!
        }
}