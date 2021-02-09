package me.guillem.MovieMVVM.core

import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 ** Created by Guillem on 09/02/21.
 */
abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bind(item: T)
}