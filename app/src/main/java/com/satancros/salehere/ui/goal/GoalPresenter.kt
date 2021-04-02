package com.satancros.salehere.ui.goal

import java.util.ArrayList

interface GoalView {
    fun displayGoalAdapter(viewModel: ArrayList<GoalModel.ViewModel.GoalAdapter>)
}

class GoalPresenter {

    /* init*/
    lateinit var fragment: GoalFragment

    fun presentGoalAdapter(viewModel: ArrayList<GoalModel.ViewModel.GoalAdapter>) {
        fragment.displayGoalAdapter(viewModel)
    }
}