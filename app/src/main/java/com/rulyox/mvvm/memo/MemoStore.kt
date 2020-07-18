package com.rulyox.mvvm.memo

object MemoStore {

    private var memoList: ArrayList<Memo> = ArrayList()

    fun getList(): ArrayList<Memo> {
        return memoList
    }

    fun getNewId(): Int {
        return memoList.size
    }

    fun add(memo: Memo) {
        memoList.add(memo)
    }

    fun delete(position: Int) {
        memoList.removeAt(position)
    }

}
