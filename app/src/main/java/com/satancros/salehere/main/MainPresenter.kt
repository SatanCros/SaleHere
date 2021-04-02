package com.satancros.salehere.main

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi

interface MainView {
    fun displayNotificationNumber(message: MainModel.Response.Event?)
}

class MainPresenter {

    /*init*/
    lateinit var activity: MainActivity

    fun updateEvent(data: String) {
        val moshi = Moshi.Builder().build()
        val adapter: JsonAdapter<MainModel.Response.Event> = moshi.adapter(MainModel.Response.Event::class.java)
        val response = adapter.fromJson(data)
        activity.displayNotificationNumber(response)
    }
}