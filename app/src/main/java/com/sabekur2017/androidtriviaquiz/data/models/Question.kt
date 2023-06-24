package com.sabekur2017.androidtriviaquiz.data.models

data class Question(
    val id: Int,
    val question: String,
    val optionA: String,
    val optionB: String,
    val optionC: String,
    val optionD: String,
    val answer: Int
)
