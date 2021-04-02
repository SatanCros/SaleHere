package com.satancros.salehere.utils

import android.annotation.SuppressLint
import android.content.Context

class Contextor private constructor() {

    var context: Context? = null

    companion object {

        @SuppressLint("StaticFieldLeak")
        private var instance: Contextor? = null

        fun getInstance(): Contextor {
            if (instance == null)
                instance = Contextor()
            return instance as Contextor
        }
    }
}