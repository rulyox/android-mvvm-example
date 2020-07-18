package com.rulyox.mvvm.handler

import android.app.Activity.RESULT_OK
import android.content.Intent
import android.view.View
import com.rulyox.mvvm.activity.AddActivity

class AddHandlers {

    fun clickAddButton(view: View) {

        if(view.context !is AddActivity) return
        val activity = view.context as AddActivity

        val title: String = activity.memo.title
        val text: String = activity.memo.text

        val intent = Intent()
        intent.putExtra("title", title)
        intent.putExtra("text", text)
        activity.setResult(RESULT_OK, intent)
        activity.finish()

    }

    fun clickCancelButton(view: View) {

        if(view.context !is AddActivity) return
        val activity = view.context as AddActivity

        activity.finish()

    }

}
