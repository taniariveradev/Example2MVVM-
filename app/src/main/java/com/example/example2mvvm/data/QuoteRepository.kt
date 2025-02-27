package com.example.example2mvvm.data

import com.example.example2mvvm.data.model.QuoteModel
import com.example.example2mvvm.data.model.QuoteProvider
import com.example.example2mvvm.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}