package com.ahmed_apps.workmanager

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

/**
 * @author Ahmed Guedmioui
 */
@HiltWorker
class DataSyncWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted workerParameters: WorkerParameters,
    private val dataSyncRepository: DataSyncRepository
) : CoroutineWorker(
    context, workerParameters
) {

    override suspend fun doWork(): Result {
        return try {
            dataSyncRepository.syncData()
            Result.success()
        } catch (e: Exception) {
            Result.retry()
        }

    }
}


















