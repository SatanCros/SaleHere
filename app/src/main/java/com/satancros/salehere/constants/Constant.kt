package com.satancros.salehere.constants

object Constant {

    const val URL = "https://px-socket-api.herokuapp.com/"
    const val EVENT = "new-notification"

    enum class Status(val color: String, val status: String) {
        GOOD("#1C7C11", "Good"),
        UNHAPPY("#AC3D35", "Unhappy")
    }
}