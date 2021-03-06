package com.rulyox.mvvm.handler

import android.content.Intent
import android.view.View
import com.rulyox.mvvm.activity.AddActivity
import com.rulyox.mvvm.activity.MainActivity

class MainHandlers {

    fun clickAddButton(view: View) {

        if(view.context !is MainActivity) return
        val activity = view.context as MainActivity

        // open add dialog
        val addIntent = Intent(activity, AddActivity::class.java)
        activity.startActivityForResult(addIntent, MainActivity.REQUEST_ADD)

    }

    fun clickItem(view: View, position: Int) {

        if(view.context !is MainActivity) return
        val activity = view.context as MainActivity

        // open delete dialog
        activity.openDeleteDialog(position)

    }

}
