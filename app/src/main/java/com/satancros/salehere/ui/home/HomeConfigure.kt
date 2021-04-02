package com.satancros.salehere.ui.home

class HomeConfigure {

    companion object {
        fun configure(fragment: HomeFragment) {
            val route = HomeRoute()
            val presenter = HomePresenter()
            val interactor = HomeInteractor()

            route.fragment = fragment
            presenter.fragment = fragment
            interactor.presenter = presenter
            fragment.interactor = interactor
            fragment.route = route
        }
    }
}