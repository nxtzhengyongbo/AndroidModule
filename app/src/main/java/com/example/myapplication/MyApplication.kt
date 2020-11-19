package com.example.myapplication

import android.app.Application
import com.alibaba.android.arouter.BuildConfig.*
import com.alibaba.android.arouter.launcher.ARouter

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        ARouter.openLog()  // Print log
        ARouter.openDebug()   // Turn on debugging mode (If you are running in InstantRun mode, you must turn on debug mode! Online version needs to be closed, otherwise there is a security risk)
        ARouter.init(this)
    }
}