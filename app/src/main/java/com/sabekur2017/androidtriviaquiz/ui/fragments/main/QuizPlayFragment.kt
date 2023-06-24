package com.sabekur2017.androidtriviaquiz.ui.fragments.main


import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.sabekur2017.androidtriviaquiz.R
import com.sabekur2017.androidtriviaquiz.base.BaseFragment
import com.sabekur2017.androidtriviaquiz.data.models.Question
import com.sabekur2017.androidtriviaquiz.databinding.FragmentQuizPlayBinding
import com.sabekur2017.androidtriviaquiz.ui.fragments.MainViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class QuizPlayFragment : BaseFragment<MainViewModel, FragmentQuizPlayBinding>(
    R.layout.fragment_quiz_play
), View.OnClickListener {
    override val viewModel by viewModels<MainViewModel>()
    private var questionList: ArrayList<Question>? = null
    private var selectQuestion: Question? = null
    override fun initializeViewBinding(view: View) = FragmentQuizPlayBinding.bind(view)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribeObserver()
        setupListener()
        setupQuestionList()
    }

    private fun subscribeObserver() {
        questionList = viewModel.getQuestions()
    }

    private fun setupListener() {
        binding.tvOptionA.setOnClickListener(this)
        binding.tvOptionB.setOnClickListener(this)
        binding.tvOptionC.setOnClickListener(this)
        binding.tvOptionD.setOnClickListener(this)
        binding.btnSubmitAnswer.setOnClickListener(this)
    }

    private fun setupQuestionList() {
        //todo: selected question iterate
        selectQuestion = questionList?.first()
        binding.tvQuestion.text = selectQuestion?.question
        binding.tvOptionA.text = selectQuestion?.optionA
        binding.tvOptionB.text = selectQuestion?.optionB
        binding.tvOptionC.text = selectQuestion?.optionC
        binding.tvOptionD.text = selectQuestion?.optionD
    }


    override fun onClick(view: View?) {
        when (view?.id) {

            R.id.tvOptionA -> {

            }

            R.id.tvOptionB -> {

            }

            R.id.tvOptionC -> {

            }

            R.id.tvOptionD -> {

            }

            R.id.btnSubmitAnswer -> {

            }
        }
    }

}