package com.satancros.salehere.ui.home

import com.satancros.salehere.constants.Constant

class HomeModel {

    class ViewModel {

        data class HomeAdapter(
            val image: Int,
            val discount: String,
            val amount: String,
            val progressBar: Int,
            val title: String,
            val status: Constant.Status,
            val day: String
        )
    }
}