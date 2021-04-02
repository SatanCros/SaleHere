package com.satancros.salehere.ui.achievement

import java.util.ArrayList

interface AchievementView {
    fun displayAchievementAdapter(viewModel: ArrayList<AchievementModel.ViewModel.AchievementAdapter>)
}

class AchievementPresenter {

    /* init*/
    lateinit var fragment: AchievementFragment

    fun presentAchievementAdapter(viewModel: ArrayList<AchievementModel.ViewModel.AchievementAdapter>) {
        fragment.displayAchievementAdapter(viewModel)
    }
}