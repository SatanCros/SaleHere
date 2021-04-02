package com.satancros.salehere.main

class MainConfigure {

    companion object {
        fun configure(activity: MainActivity) {
            val route = MainRoute()
            val presenter = MainPresenter()
            val interactor = MainInteractor()

            route.activity = activity
            presenter.activity = activity
            interactor.presenter = presenter
            interactor.worker = MainWorker()
            activity.interactor = interactor
            activity.route = route
        }
    }
}