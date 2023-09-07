package com.velmurugan.hiltandroid.data

import dagger.hilt.android.qualifiers.ActivityContext
import retrofit2.Response
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(private val apiService: ApiService): MainRepository {
    override suspend fun getAllMovies() = apiService.getAllMovies()
    override suspend fun getVersion(): Response<Int> {
        return Response.success(4)
    }
}