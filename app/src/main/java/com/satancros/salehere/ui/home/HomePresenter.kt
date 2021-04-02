package com.satancros.salehere.ui.home

import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

interface HomeView {
    fun displayGoalAdapter(viewModel: ArrayList<HomeModel.ViewModel.HomeAdapter>)
    fun displayGoalPage()
    fun displayOfferAndSuggestAdapter(viewModel: ArrayList<Int>)
    fun setLayoutManager(recyclerView: RecyclerView)
}

class HomePresenter {

    /*init*/
    lateinit var fragment: HomeFragment

    fun presentHomeAdapter(viewModel: ArrayList<HomeModel.ViewModel.HomeAdapter>) {
        fragment.displayGoalAdapter(viewModel)
    }

    fun presentGoalPage() {
        fragment.displayGoalPage()
    }

    fun presentOfferAndSuggestAdapter(viewModel: ArrayList<Int>) {
        fragment.displayOfferAndSuggestAdapter(viewModel)
    }

    fun presentLayoutManger(recyclerView: RecyclerView) {
        fragment.setLayoutManager(recyclerView)
    }
}