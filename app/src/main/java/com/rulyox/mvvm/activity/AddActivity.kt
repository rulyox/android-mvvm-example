package com.rulyox.mvvm.activity

import android.app.Activity
import android.os.Bundle
import com.rulyox.mvvm.databinding.DialogBinding

class AddActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: DialogBinding = DialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}
