package com.rulyox.mvvm.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rulyox.mvvm.databinding.ItemBinding
import com.rulyox.mvvm.memo.Memo

class MemoAdapter: RecyclerView.Adapter<MemoAdapter.MemoViewHolder>() {

    private var memoList: ArrayList<Memo>? = null

    fun setList(memoList: ArrayList<Memo>) {
        this.memoList = memoList
    }

    override fun getItemCount(): Int {
        return memoList?.size ?: 0
    }

    class MemoViewHolder(val binding: ItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MemoViewHolder {

        val binding: ItemBinding = ItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return MemoViewHolder(binding)

    }

    override fun onBindViewHolder(viewholder: MemoViewHolder, position: Int) {

        if(memoList == null) return

        val memo = memoList!![position]

        viewholder.binding.memo = memo

    }

}
