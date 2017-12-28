package com.sunmeng.daggerlearning

import android.app.Application

/**
 * Created by sunmeng on 2017/12/28.
 * Email:sunmeng995@gmail.com
 * Description:
 */
class AppApplication : Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerApplicationComponent.builder().appApplicationModule(AppApplicationModule(this)).build()
        component.inject(this)
    }
}