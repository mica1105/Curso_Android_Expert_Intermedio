package com.cursokotlin.horoscapp.ui.detail

import com.cursokotlin.horoscapp.domain.model.HoroscopeModel

sealed class HoroscopeDetailState {
    data object Loading : HoroscopeDetailState()
    data class Error(val error: String) : HoroscopeDetailState()
    data class Success(val prediction: String, val sign: String, val  horoscope: HoroscopeModel) : HoroscopeDetailState()
}