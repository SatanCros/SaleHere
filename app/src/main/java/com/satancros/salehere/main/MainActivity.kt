package com.satancros.salehere.main

import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.satancros.salehere.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity(), MainView {

    /*init*/
    lateinit var interactor: MainInteractor
    lateinit var route: MainRoute

    init {
        MainConfigure.configure(this)
    }

    private lateinit var navView: BottomNavigationView
    private val itemsCount = ArrayList<String?>()

    override fun onCreate(savedInstanceState: Bundle?) {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        nav_view.setupWithNavController(navController)

        interactor.callSocket()
    }

    override fun displayNotificationNumber(message: MainModel.Response.Event?) {
        message?.message.let {
            itemsCount.add(it)
            val badge = navView.getOrCreateBadge(R.id.navigation_profile)
            badge.isVisible = true
            badge.number = itemsCount.size
        }
    }
}