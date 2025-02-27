package com.example.example2mvvm.domain

import com.example.example2mvvm.data.model.QuoteModel
import com.example.example2mvvm.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    operator fun invoke(): QuoteModel? {
        // Caso de uso que recupera una lista de quotes
        val quotes = QuoteProvider.quotes
        //Si no es nulo ni vacio, genera numero random entre el tamaño de quotes y retorna uno random
        if (!quotes.isNullOrEmpty()) {
            val randomNumber = (0..quotes.size - 1).random()
            return quotes[3]
        }
        //Si no, retorna un nulo
        return null
    }
}