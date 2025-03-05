package com.example.lolchampions.domain.repository

import com.example.lolchampions.domain.model.ChampionResponseModel
import com.skydoves.sandwich.ApiResponse

interface ApiRepository {

    suspend fun getAllChampions(): ApiResponse<ChampionResponseModel>

    suspend fun getChampionByName(name: String): ApiResponse<ChampionResponseModel>
}