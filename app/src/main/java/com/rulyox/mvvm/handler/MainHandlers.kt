package com.rulyox.mvvm.handler

import android.content.Intent
import android.view.View
import com.rulyox.mvvm.activity.AddActivity
import com.rulyox.mvvm.activity.MainActivity

class MainHandlers {

    fun clickAddButton(view: View) {

        if(view.context !is MainActivity) return
        val activity = view.context as MainActivity

        val addIntent = Intent(activity, AddActivity::class.java)
        activity.startActivityForResult(addIntent, 1)

    }

}
