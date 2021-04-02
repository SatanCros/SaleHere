package com.satancros.salehere.ui.goal

class GoalConfigure {

    companion object {
        fun configure(fragment: GoalFragment) {
            val route = GoalRoute()
            val presenter = GoalPresenter()
            val interactor = GoalInteractor()

            route.fragment = fragment
            presenter.fragment = fragment
            interactor.presenter = presenter
            fragment.interactor = interactor
            fragment.route = route
        }
    }
}