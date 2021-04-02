package com.satancros.salehere.ui.goal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.satancros.salehere.R
import kotlinx.android.synthetic.main.fragment_goal.*
import java.util.ArrayList

class GoalFragment : Fragment(), GoalView {

    /* init*/
    lateinit var interactor: GoalInteractor
    lateinit var route: GoalRoute

    init {
        GoalConfigure.configure(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_goal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        interactor.makeModel()
    }

    override fun displayGoalAdapter(viewModel: ArrayList<GoalModel.ViewModel.GoalAdapter>) {
        val goalAdapter = GoalAdapter(viewModel)

        val gridLayoutManager = GridLayoutManager(context, 3)
        gridLayoutManager.orientation = LinearLayoutManager.VERTICAL
        gridLayoutManager.reverseLayout = false
        gridLayoutManager.isSmoothScrollbarEnabled = true

        recycler_card.adapter = goalAdapter
        recycler_card.layoutManager = gridLayoutManager
    }
}