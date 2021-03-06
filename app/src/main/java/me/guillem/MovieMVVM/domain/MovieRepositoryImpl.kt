package me.guillem.MovieMVVM.domain

import me.guillem.MovieMVVM.data.model.MovieList
import me.guillem.MovieMVVM.data.remote.MovieDataSource

/**
 ** Created by Guillem on 09/02/21.
 */
class MovieRepositoryImpl(private val dataSource: MovieDataSource): MovieRepository {

    override suspend fun getUpcomingMovies(): MovieList = dataSource.getUpcomingMovies()
    override suspend fun getTopRatedMovies(): MovieList = dataSource.getTopRatedMovies()
    override suspend fun getPopularMovies(): MovieList = dataSource.getPopularMovies()
}