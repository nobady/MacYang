package com.macyang

import android.app.Activity
import android.app.Application
import android.os.Bundle
import com.hss01248.dialog.MyActyManager
import com.hss01248.dialog.StyledDialog
import com.macyang.utils.AppManager
import com.ohmerhe.kolley.request.Http

/**
 * 项目的Application，管理所有activity的生命周期，初始化一些方法
 * Created by tengfei.lv on 2017/8/29.
 */
class App:Application() {
    override fun onCreate() {
        super.onCreate()

        Http.init(this)
        StyledDialog.init(this)
        registerActivityLifecycleCallbacks(object :ActivityLifecycleCallbacks{
            override fun onActivityPaused(p0: Activity?) {
            }

            override fun onActivityResumed(p0: Activity?) {
                MyActyManager.getInstance().currentActivity = p0
            }

            override fun onActivityStarted(p0: Activity?) {
            }

            override fun onActivityDestroyed(p0: Activity?) {
                AppManager.finishActivity(p0)
            }

            override fun onActivitySaveInstanceState(p0: Activity?, p1: Bundle?) {
            }

            override fun onActivityStopped(p0: Activity?) {
            }

            override fun onActivityCreated(p0: Activity, p1: Bundle?) {
                AppManager.addActivity(p0)
            }
        })
    }
}