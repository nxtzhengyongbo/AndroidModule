package com.example.base

import android.content.Context

open class BaseService<T> : IBaseService<T> {
    var t: T? = null
    override fun getData(): T? {
        return t
    }

    override fun init(context: Context?) {
    }

    override fun setData(t: T?) {
        this.t = t
    }
}