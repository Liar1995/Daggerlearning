package com.sunmeng.daggerlearning

import dagger.Component
import javax.inject.Singleton

/**
 * Created by sunmeng on 2017/12/28.
 * Email:sunmeng995@gmail.com
 * Description:
 */
@Singleton
@Component(modules = [(AppApplicationModule::class)])
interface ApplicationComponent {
    fun inject(demoActivity: MainActivity)
    fun inject(application: AppApplication)
}