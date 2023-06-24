package com.sabekur2017.androidtriviaquiz

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TriviaQuiz : Application() {
    override fun onCreate() {
        super.onCreate()
    }

}