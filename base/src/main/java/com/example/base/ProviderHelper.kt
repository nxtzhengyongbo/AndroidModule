package com.example.base

import com.alibaba.android.arouter.launcher.ARouter

class ProviderHelper {
    companion object {
        fun getService(): BaseService<String?> {
            return ARouter.getInstance().build("/test/receiver").navigation() as BaseService<String?>
        }
    }
}