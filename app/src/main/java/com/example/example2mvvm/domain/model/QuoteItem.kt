package com.example.example2mvvm.domain.model

import com.example.example2mvvm.data.database.entities.QuoteEntity
import com.example.example2mvvm.data.model.QuoteModel

data class Quote(val quote: String, val author: String)

fun QuoteModel.toDomain() = Quote(quote, author)
fun QuoteEntity.toDomain() = Quote(quote, author)