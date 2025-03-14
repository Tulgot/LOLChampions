package com.example.lolchampions.domain.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ImageModel(
    @SerialName("full")
    val full: String? = "",
    @SerialName("group")
    val group: String? = ""
)