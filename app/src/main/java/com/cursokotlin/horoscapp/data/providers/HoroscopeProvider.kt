package com.cursokotlin.horoscapp.data.providers

import com.cursokotlin.horoscapp.domain.model.HoroscopeInfo
import com.cursokotlin.horoscapp.domain.model.HoroscopeInfo.*
import jakarta.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscope(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}