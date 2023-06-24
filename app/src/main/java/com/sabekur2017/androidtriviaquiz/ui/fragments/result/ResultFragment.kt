package com.sabekur2017.androidtriviaquiz.ui.fragments.result


import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.sabekur2017.androidtriviaquiz.R
import com.sabekur2017.androidtriviaquiz.base.BaseFragment
import com.sabekur2017.androidtriviaquiz.databinding.FragmentResultBinding
import com.sabekur2017.androidtriviaquiz.ui.fragments.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ResultFragment : BaseFragment<MainViewModel,FragmentResultBinding>(
    R.layout.fragment_result
) {
    override val viewModel by viewModels<MainViewModel>()
    override fun initializeViewBinding(view: View)= FragmentResultBinding.bind(view)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}