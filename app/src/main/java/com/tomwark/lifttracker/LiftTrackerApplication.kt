package com.tomwark.lifttracker

import android.app.Application

class LiftTrackerApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: LiftTrackerApplication
            private set
    }
}
