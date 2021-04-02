package com.satancros.salehere.ui.goal

import com.satancros.salehere.R

class GoalInteractor {

    /* init*/
    lateinit var presenter: GoalPresenter

    fun makeModel() {
        val viewModel = arrayListOf<GoalModel.ViewModel.GoalAdapter>()
        val needItem = 5
        for (count in 1..needItem) {
            viewModel.add(
                GoalModel.ViewModel.GoalAdapter(
                    image = R.drawable.ic_home_black_24dp,
                    text = "Icon $count"
                )
            )
        }
        presenter.presentGoalAdapter(viewModel)
    }
}