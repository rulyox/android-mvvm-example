package com.rulyox.mvvm.activity

import android.app.Activity
import android.os.Bundle
import com.rulyox.mvvm.handler.AddHandlers
import com.rulyox.mvvm.databinding.DialogBinding
import com.rulyox.mvvm.memo.Memo

class AddActivity: Activity() {

    val memo = Memo(0, "", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: DialogBinding = DialogBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.memo = memo
        binding.handlers = AddHandlers()

    }

}
