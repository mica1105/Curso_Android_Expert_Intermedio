package com.cursokotlin.horoscapp.data.network.response

import com.cursokotlin.horoscapp.domain.model.PredictionModel
import com.google.gson.annotations.SerializedName

data class PredictionResponse(
    @SerializedName("date") val date: String,
    @SerializedName("horoscope") val horoscope: String,
    @SerializedName("sign") val sign: String
){
    fun toDomain(): PredictionModel {
        return PredictionModel(
            horoscope = date + horoscope,
            sign = sign
        )
    }
}
