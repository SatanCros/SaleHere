package com.satancros.salehere.ui.home

import androidx.recyclerview.widget.RecyclerView
import com.satancros.salehere.constants.Constant
import com.satancros.salehere.R

class HomeInteractor {

    /*init*/
    lateinit var presenter: HomePresenter

    fun makeModelHeader() {
        val viewModel = arrayListOf<HomeModel.ViewModel.HomeAdapter>()
        viewModel.add(
            HomeModel.ViewModel.HomeAdapter(
                image = R.drawable.ic_home_black_24dp,
                discount = "16,500",
                amount = "20,000",
                progressBar = 65,
                title = "ไปเที่ยวญี่ปุ่น",
                status = Constant.Status.GOOD,
                day = "45"
            )
        )
        viewModel.add(
            HomeModel.ViewModel.HomeAdapter(
                image = R.drawable.ic_home_black_24dp,
                discount = "500",
                amount = "6,000",
                progressBar = 28,
                title = "ซื้อกองทุนรวม",
                status = Constant.Status.UNHAPPY,
                day = "20"
            )
        )
        viewModel.add(
            HomeModel.ViewModel.HomeAdapter(
                image = R.drawable.ic_home_black_24dp,
                discount = "8,500",
                amount = "13,000",
                progressBar = 90,
                title = "ไปทะเล",
                status = Constant.Status.GOOD,
                day = "45"
            )
        )
        presenter.presentHomeAdapter(viewModel)
    }

    fun openGoal() {
        presenter.presentGoalPage()
    }

    fun makeModelOfferAndSuggest() {
        val viewModel = arrayListOf<Int>()
        for (count in 1..5) viewModel.add(count)
        presenter.presentOfferAndSuggestAdapter(viewModel)
    }

    fun setLayoutManager(recyclerView: RecyclerView) {
        presenter.presentLayoutManger(recyclerView)
    }
}