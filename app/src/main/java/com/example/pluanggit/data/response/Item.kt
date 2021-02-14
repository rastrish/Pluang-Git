package com.example.pluanggit.data.response

import java.io.Serializable

data class Item (
    val added_stars: String,
    val avatars: List<String>,
    val desc: String,
    val forks: String,
    val lang: String,
    val repo: String,
    val repo_link: String,
    val stars: String
) : Serializable