package me.guillem.MovieMVVM.ui


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import me.guillem.MovieMVVM.core.BaseConcatHolder
import me.guillem.MovieMVVM.databinding.TopRatedMovieBinding


class TopRatedConcatAdapter(private val moviesAdapter: MoviesAdapter): RecyclerView.Adapter<BaseConcatHolder<*>>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseConcatHolder<*> {
        val itemBinding = TopRatedMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ConcatViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: BaseConcatHolder<*>, position: Int) {
        when (holder) {
            is ConcatViewHolder -> holder.bind(moviesAdapter)
            else -> throw IllegalArgumentException("No viewholder to show this data, did you forgot to add it to the onBindViewHolder?")
        }
    }

    override fun getItemCount(): Int = 1

    private inner class ConcatViewHolder(val binding: TopRatedMovieBinding) : BaseConcatHolder<MoviesAdapter>(binding.root) {
        override fun bind(adapter: MoviesAdapter) {
            binding.rvTopRatedMovies.adapter = adapter
        }
    }
}