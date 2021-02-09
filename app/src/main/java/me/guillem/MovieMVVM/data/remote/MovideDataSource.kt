package me.guillem.MovieMVVM.data.remote

import me.guillem.MovieMVVM.app.AppConstants
import me.guillem.MovieMVVM.data.model.MovieList
import me.guillem.MovieMVVM.domain.WebService

/**
 ** Created by Guillem on 09/02/21.
 */
class MovieDataSource(private val webService: WebService) {

    suspend fun getUpcomingMovies(): MovieList {
        return webService.getUpcomingMovies(AppConstants.API_KEY)
    }

    suspend fun getTopRatedMovies(): MovieList {
        return webService.getTopRatedMovies(AppConstants.API_KEY)
    }

    suspend fun getPopularMovies(): MovieList {
        return webService.getPopulardMovies(AppConstants.API_KEY)
    }
}