package com.example.receiver

import com.alibaba.android.arouter.facade.annotation.Route
import com.example.base.BaseService

@Route(path = "/test/receiver")
class TestService : BaseService<String?>() {
    override fun getData(): String? {
        setData("sssss")
        return super.getData()
    }
}

