package com.satancros.salehere.ui.home

import androidx.navigation.fragment.findNavController
import com.satancros.salehere.R

class HomeRoute {

    /*init*/
    lateinit var fragment: HomeFragment

    fun navigateToGoalPage() {
        fragment.findNavController().navigate(R.id.navigation_goal)
    }
}