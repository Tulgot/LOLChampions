package com.example.lolchampions.ui.screen.champion_list

import com.example.lolchampions.domain.model.ChampionModel

data class ChampionListState(
    val champions: List<ChampionModel> = emptyList()
)
