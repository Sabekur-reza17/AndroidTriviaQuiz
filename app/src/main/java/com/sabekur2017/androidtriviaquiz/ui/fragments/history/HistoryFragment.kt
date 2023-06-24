package com.sabekur2017.androidtriviaquiz.ui.fragments.history


import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.sabekur2017.androidtriviaquiz.R
import com.sabekur2017.androidtriviaquiz.base.BaseFragment
import com.sabekur2017.androidtriviaquiz.databinding.FragmentHistoryBinding
import com.sabekur2017.androidtriviaquiz.ui.fragments.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HistoryFragment : BaseFragment<MainViewModel, FragmentHistoryBinding>(
    R.layout.fragment_history
) {
    override val viewModel by viewModels<MainViewModel>()

    override fun initializeViewBinding(view: View) = FragmentHistoryBinding.bind(view)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}