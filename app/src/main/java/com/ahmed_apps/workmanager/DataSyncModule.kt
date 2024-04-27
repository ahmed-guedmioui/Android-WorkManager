package com.ahmed_apps.workmanager

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @author Ahmed Guedmioui
 */
@Module
@InstallIn(SingletonComponent::class)
object DataSyncModule {

    @Provides
    @Singleton
    fun providesDataSyncRepository(
        application: Application
    ): DataSyncRepository {
        return DataSyncRepository(application)
    }

}














