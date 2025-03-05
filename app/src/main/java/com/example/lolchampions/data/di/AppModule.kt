package com.example.lolchampions.data.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    fun privideHttpClient(): HttpClient =
        HttpClient(OkHttp.create()) {

        }
}