package com.satancros.salehere.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.satancros.salehere.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.recycler_card
import java.util.ArrayList

class HomeFragment : Fragment(), HomeView {

    /*init*/
    lateinit var interactor: HomeInteractor
    lateinit var route: HomeRoute

    init {
        HomeConfigure.configure(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        text_title_bestOffer.text = getString(R.string.best_offer)
        text_title_suggestForYou.text = getString(R.string.suggest_for_you)

        interactor.makeModelHeader()
        interactor.makeModelOfferAndSuggest()
        onAction()
    }

    private fun onAction() {
        btn_newGoal.setOnClickListener {
            interactor.openGoal()
        }
    }

    override fun displayGoalAdapter(viewModel: ArrayList<HomeModel.ViewModel.HomeAdapter>) {
        val homeAdapter = HomeAdapter(viewModel)
        recycler_card.adapter = homeAdapter
        interactor.setLayoutManager(recycler_card)
    }

    override fun displayGoalPage() {
        route.navigateToGoalPage()
    }

    override fun displayOfferAndSuggestAdapter(viewModel: ArrayList<Int>) {
        val adapter = OfferAndSuggestAdapter(viewModel)
        recycler_card_bestOffer.adapter = adapter
        recycler_card_suggestForYou.adapter = adapter
        interactor.setLayoutManager(recycler_card_bestOffer)
        interactor.setLayoutManager(recycler_card_suggestForYou)
    }

    override fun setLayoutManager(recyclerView: RecyclerView) {
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        layoutManager.reverseLayout = false
        layoutManager.isSmoothScrollbarEnabled = true
        recyclerView.layoutManager = layoutManager
    }
}