package com.satancros.salehere.main

class MainInteractor {

    /*init*/
    lateinit var presenter: MainPresenter
    lateinit var worker: MainWorker

    fun callSocket() {
        worker.emit(
            onSuccess = { presenter.updateEvent(it) },
            onFailure = {}
        )
    }
}