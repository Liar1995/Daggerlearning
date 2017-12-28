package com.sunmeng.daggerlearning

import android.content.Context
import android.location.LocationManager
import dagger.Module
import android.content.Context.LOCATION_SERVICE
import dagger.Provides
import javax.inject.Singleton


/**
 * Created by sunmeng on 2017/12/28.
 * Email:sunmeng995@gmail.com
 * Description:
 */
@Module
class AppApplicationModule(private val context: Context) {

    @Provides
    @Singleton
    fun provideLocationManager(): LocationManager {
        return context.getSystemService(LOCATION_SERVICE) as LocationManager
    }
}