package com.satancros.salehere.ui.achievement

import com.satancros.salehere.R

class AchievementInteractor {

    /* init*/
    lateinit var presenter: AchievementPresenter

    fun makeModel() {
        val viewModel = arrayListOf<AchievementModel.ViewModel.AchievementAdapter>()
        val needItem = 8
        for (count in 1..needItem) {
            viewModel.add(
                AchievementModel.ViewModel.AchievementAdapter(
                    image = R.drawable.ic_baseline_stars_24,
                    text = "Achievement"
                )
            )
        }

        presenter.presentAchievementAdapter(viewModel)
    }
}