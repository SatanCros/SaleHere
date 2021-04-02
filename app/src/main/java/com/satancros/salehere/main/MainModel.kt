package com.satancros.salehere.main

import com.squareup.moshi.JsonClass

class MainModel {

    class Response {
        @JsonClass(generateAdapter = true)
        data class Event(
            val message: String
        )
    }
}