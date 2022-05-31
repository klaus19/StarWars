package com.example.starwars.model

import com.google.gson.annotations.SerializedName

data class Starwars(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: Any,
    @SerializedName("results")
    val results: List<Result>
)