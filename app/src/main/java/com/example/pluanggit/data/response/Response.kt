package com.example.pluang.data.response

import com.example.pluanggit.data.response.Item

data class Response(
    val count: Int,
    val items: List<Item>,
    val msg: String
)