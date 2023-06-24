package com.sabekur2017.androidtriviaquiz.ui.fragments

import com.sabekur2017.androidtriviaquiz.base.BaseViewModel
import com.sabekur2017.androidtriviaquiz.data.models.Question
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
open class MainViewModel @Inject constructor() : BaseViewModel() {

    private val questionList = ArrayList<Question>()

    fun getQuestions(): ArrayList<Question> {
        questionList.add(
            Question(
                1,
                question = "In which Italian city can you find the Colosseum?",
                optionA = "Venice",
                optionB = "Rome",
                optionC = "Naples",
                optionD = "Milan",
                answer = 2
            )
        )
        questionList.add(
            Question(
                2,
                question = "Who wrote Catch-22?",
                optionA = "Mark Twain",
                optionB = "Ernest Hemingway",
                optionC = "Charles Dickens",
                optionD = "Joseph Heller",
                answer = 4
            )
        )
        questionList.add(
            Question(
                3,
                question = "When were Guy Fawkes and The Gunpowder Plot discovered?",
                optionA = "1505",
                optionB = "1605",
                optionC = "1705",
                optionD = "1805",
                answer = 2
            )
        )
        questionList.add(
            Question(
                4,
                question = "What is the name of the main character in Pride and Prejudice?",
                optionA = "Bernadette Smith",
                optionB = "Poppy Williams",
                optionC = "Elizabeth Bennet",
                optionD = "Maggie Johnson",
                answer = 3
            )
        )
        questionList.add(
            Question(
                5,
                question = "Which country does not share a border with Romania?",
                optionA = "Ukraine",
                optionB = "Bulgaria",
                optionC = "Hungary",
                optionD = "Poland",
                answer = 4
            )
        )

        return questionList

    }


}