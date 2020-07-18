package com.rulyox.mvvm.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.rulyox.mvvm.databinding.ActivityMainBinding
import com.rulyox.mvvm.handler.MainHandlers
import com.rulyox.mvvm.memo.Memo
import com.rulyox.mvvm.memo.MemoStore
import com.rulyox.mvvm.memo.MemoViewModel

class MainActivity: AppCompatActivity() {

    companion object {
        const val REQUEST_ADD = 1
    }

    private val model: MemoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind()

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == RESULT_OK) {

            if(requestCode == REQUEST_ADD) {

                // get data from add dialog
                val title: String? = data?.getStringExtra("title")
                val text: String? = data?.getStringExtra("text")

                if(title == null || text == null) return

                // add new memo to model
                val memo = Memo(MemoStore.getNewId(), title, text)
                model.addMemo(memo)

            }

        }

    }

    private fun bind() {

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.mainToolBar)
        binding.handlers = MainHandlers()

        model.getMemoList().observe(this, Observer<ArrayList<Memo>>{ memoList ->



        })

    }

}
