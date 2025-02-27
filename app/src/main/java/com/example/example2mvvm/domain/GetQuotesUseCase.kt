package com.example.example2mvvm.domain

import com.example.example2mvvm.data.QuoteRepository
import com.example.example2mvvm.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>? {
        return repository.getAllQuotes()
    }
}