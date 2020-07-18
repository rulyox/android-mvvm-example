package com.rulyox.mvvm.handler

import android.content.Intent
import android.view.View
import com.rulyox.mvvm.activity.AddActivity

class MainHandlers {

    fun clickAddButton(view: View) {

        val addIntent = Intent(view.context, AddActivity::class.java)
        view.context.startActivity(addIntent)

    }

}
