package com.mentoria.meuslivros

import com.google.gson.annotations.SerializedName

data class Book(
    val id: Int,
    val title: String,
    val subjects: List<String>,
    val authors: List<Author>,
    val formats: Formats
)

data class Formats(
    @SerializedName("image/jpeg") val imageUrl: String,
    @SerializedName("text/html") val previewLink: String,
)
