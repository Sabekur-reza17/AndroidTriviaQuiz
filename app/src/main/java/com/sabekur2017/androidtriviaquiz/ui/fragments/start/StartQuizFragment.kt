package com.sabekur2017.androidtriviaquiz.ui.fragments.start

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.sabekur2017.androidtriviaquiz.R
import com.sabekur2017.androidtriviaquiz.base.BaseFragment
import com.sabekur2017.androidtriviaquiz.databinding.FragmentStartQuizBinding
import com.sabekur2017.androidtriviaquiz.ui.fragments.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StartQuizFragment : BaseFragment<MainViewModel, FragmentStartQuizBinding>(
    R.layout.fragment_start_quiz
) {
    override val viewModel by viewModels<MainViewModel>()
    override fun initializeViewBinding(view: View) = FragmentStartQuizBinding.bind(view)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }
    private fun setupListener(){
        binding.btnStartQuiz.setOnClickListener {
            findNavController().navigate(R.id.quizPlayFragment)
        }
        binding.btnViewHistory.setOnClickListener {
            findNavController().navigate(R.id.historyFragment)
        }
    }
}