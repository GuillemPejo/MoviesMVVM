package me.guillem.MovieMVVM.domain

import me.guillem.MovieMVVM.data.model.MovieList

/**
 ** Created by Guillem on 09/02/21.
 */
interface MovieRepository {
    suspend fun getUpcomingMovies(): MovieList
    suspend fun getTopRatedMovies(): MovieList
    suspend fun getPopularMovies(): MovieList
}