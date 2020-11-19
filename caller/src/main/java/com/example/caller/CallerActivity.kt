package com.example.caller

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.base.ProviderHelper
import kotlinx.android.synthetic.main.activity_caller.*

class CallerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caller)
        button.setOnClickListener {
            var service = ProviderHelper.getService()
            var msg = service.getData()
            Toast.makeText(this@CallerActivity, msg, Toast.LENGTH_SHORT).show()
        }
    }
}