package com.ahmed_apps.workmanager

import android.app.Application
import androidx.hilt.work.HiltWorkerFactory
import androidx.work.Configuration
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

/**
 * @author Ahmed Guedmioui
 */
@HiltAndroidApp
class App : Application(), Configuration.Provider {

    @Inject
    lateinit var workerFactory: HiltWorkerFactory

    override lateinit var workManagerConfiguration: Configuration

    override fun onCreate() {
        super.onCreate()

        workManagerConfiguration = Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .build()

    }

}




















