package com.rulyox.mvvm.memo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MemoViewModel: ViewModel() {

    private val memoList: MutableLiveData<ArrayList<Memo>> by lazy {
        MutableLiveData<ArrayList<Memo>>()
    }

    private fun loadMemoList() {
        memoList.value = MemoStore.getList()
    }

    fun getMemoList(): LiveData<ArrayList<Memo>> {
        return memoList
    }

    fun addMemo(memo: Memo) {
        MemoStore.add(memo)
        loadMemoList()
    }

}
