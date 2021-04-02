package com.satancros.salehere.ui.achievement

class AchievementConfigure {

    companion object {
        fun configure(fragment: AchievementFragment) {
            val route = AchievementRoute()
            val presenter = AchievementPresenter()
            val interactor = AchievementInteractor()

            route.fragment = fragment
            presenter.fragment = fragment
            interactor.presenter = presenter
            fragment.interactor = interactor
            fragment.route = route
        }
    }

}