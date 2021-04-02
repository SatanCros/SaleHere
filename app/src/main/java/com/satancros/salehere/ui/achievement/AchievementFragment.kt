package com.satancros.salehere.ui.achievement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.satancros.salehere.R
import kotlinx.android.synthetic.main.fragment_achievement.*
import java.util.ArrayList

class AchievementFragment : Fragment(), AchievementView {

    /* init*/
    lateinit var interactor: AchievementInteractor
    lateinit var route: AchievementRoute

    init {
        AchievementConfigure.configure(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_achievement, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        interactor.makeModel()
    }

    override fun displayAchievementAdapter(viewModel: ArrayList<AchievementModel.ViewModel.AchievementAdapter>) {
        val achievementAdapter = AchievementAdapter(viewModel)

        val gridLayoutManager = GridLayoutManager(context, 3)
        gridLayoutManager.orientation = LinearLayoutManager.VERTICAL
        gridLayoutManager.reverseLayout = false
        gridLayoutManager.isSmoothScrollbarEnabled = true

        recycler_card.adapter = achievementAdapter
        recycler_card.layoutManager = gridLayoutManager
    }
}