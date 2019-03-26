package com.tomwark.lifttracker

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.tomwark.lifttracker.dataaccess.DatabaseClient
import com.tomwark.lifttracker.dataaccess.dao.ExerciseDao
import com.tomwark.lifttracker.dataaccess.entities.Exercise

class MainActivity : AppCompatActivity() {

    var myButton: Button? = null
    var exerciseList: LinearLayout? = null

    val exerciseDao: ExerciseDao = DatabaseClient.connection.exerciseDao()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exercises = exerciseDao.getAll()
        exerciseList = findViewById(R.id.exerciseList)
        for (exercise in exercises) {
            val textView = TextView(this)
            textView.text = "Exercise ${exercise.id} ${exercise.reps} x ${exercise.weight}"
            exerciseList?.addView(textView)
        }


        myButton = findViewById(R.id.button)
        myButton?.setOnClickListener {
            // create new exercise and persist it
            exerciseDao.insert(Exercise(1, 6,250, 8))
        }
    }
}
