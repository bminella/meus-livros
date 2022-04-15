package com.mentoria.meuslivros

import com.google.gson.annotations.SerializedName

data class Author(
    val name: String,
    @SerializedName("birth_year") val birthYear: Int?,
    @SerializedName("death_year")val deathYear: Int?
)
