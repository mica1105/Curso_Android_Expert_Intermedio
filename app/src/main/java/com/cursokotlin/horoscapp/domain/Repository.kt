package com.cursokotlin.horoscapp.domain

import com.cursokotlin.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String) : PredictionModel?
}