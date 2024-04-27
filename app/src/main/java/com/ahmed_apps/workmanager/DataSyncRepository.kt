package com.ahmed_apps.workmanager

import android.app.Application
import kotlinx.coroutines.delay

/**
 * @author Ahmed Guedmioui
 */
class DataSyncRepository(
    application: Application
) {

    suspend fun syncData() {
        delay(3000)
        println("data is synced")
    }

}