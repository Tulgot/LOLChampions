package com.example.lolchampions.data.repository

import com.example.lolchampions.domain.model.ChampionResponseModel
import com.example.lolchampions.domain.repository.ApiRepository
import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.ktor.getApiResponse
import io.ktor.client.HttpClient

class ApiRespositoryImpl (
    private val httpClient: HttpClient
): ApiRepository{

    companion object{
        const val baseUrl = "https://ddragon.leagueoflegends.com/cdn/15.5.1/data/en_US/"
    }

    override suspend fun getAllChampions(): ApiResponse<ChampionResponseModel> =
        httpClient.getApiResponse {"champion.json"}

    override suspend fun getChampionByName(name: String): ApiResponse<ChampionResponseModel> =
        httpClient.getApiResponse {"champion/$name.json"}
}