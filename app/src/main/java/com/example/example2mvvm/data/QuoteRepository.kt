package com.example.example2mvvm.data

import com.example.example2mvvm.data.database.dao.QuoteDao
import com.example.example2mvvm.data.database.entities.QuoteEntity
import com.example.example2mvvm.data.model.QuoteModel
import com.example.example2mvvm.data.network.QuoteService
import com.example.example2mvvm.domain.model.Quote
import com.example.example2mvvm.domain.model.toDomain
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteDao: QuoteDao
) {

    suspend fun getAllQuotesFromApi(): List<Quote> {
        val response: List<QuoteModel> = api.getQuotes()
        return response.map { it.toDomain() }
    }

    suspend fun getAllQuotesFromDatabase(): List<Quote> {
        val response: List<QuoteEntity> = quoteDao.getAllQuotes()
        return response.map { it.toDomain() }
    }

    suspend fun insertQuotes(quotes: List<QuoteEntity>) {
        quoteDao.insertAll(quotes)
    }

    suspend fun clearQuote() {
        quoteDao.deleteAllQuotes()
    }
}