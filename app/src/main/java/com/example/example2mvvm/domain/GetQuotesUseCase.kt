package com.example.example2mvvm.domain

import com.example.example2mvvm.data.QuoteRepository
import com.example.example2mvvm.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository: QuoteRepository) {

    suspend operator fun invoke(): List<QuoteModel>? {
        return repository.getAllQuotes()
    }
}