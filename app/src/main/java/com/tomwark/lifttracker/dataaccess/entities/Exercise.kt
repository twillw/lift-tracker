package com.tomwark.lifttracker.dataaccess.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Exercise(
    @PrimaryKey var id: Int,
    @ColumnInfo(name = "reps") var reps: Int,
    @ColumnInfo(name = "weight") var weight: Int,
    @ColumnInfo(name = "rpe") var rpe: Int
)