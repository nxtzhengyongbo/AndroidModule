package com.example.base

import com.alibaba.android.arouter.facade.template.IProvider

interface IBaseService<T> : IProvider {
    fun getData(): T?
    fun setData(t: T?)
}