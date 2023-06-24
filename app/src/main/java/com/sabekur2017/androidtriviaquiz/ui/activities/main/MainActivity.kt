package com.sabekur2017.androidtriviaquiz.ui.activities.main


import android.os.Bundle

import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.sabekur2017.androidtriviaquiz.R
import com.sabekur2017.androidtriviaquiz.base.BaseActivity
import com.sabekur2017.androidtriviaquiz.databinding.ActivityMainBinding
import com.sabekur2017.androidtriviaquiz.utilities.extension.findNavController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {
    private val navController by lazy {
        findNavController(binding.navHostMainFragment.id)
    }
    private val appBarConfiguration by lazy {
        AppBarConfiguration(
            setOf(
                R.id.startQuizFragment
            )
        )
    }


    override fun initializeViewBinding() = ActivityMainBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        NavigationUI.setupWithNavController(binding.toolBar, navController, appBarConfiguration)
    }

}