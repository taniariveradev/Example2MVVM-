package com.example.example2mvvm.data.model

class QuoteProvider {

    companion object {
        fun random(): QuoteModel {
            val position = (0..10).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "It's not a bug. It's an undocumented feature!",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "Life is like riding a bicycle. To keep your balance, you must keep moving.",
                author = "Albert Einstein"
            ),
            QuoteModel(
                quote = "The only way to do great work is to love what you do.",
                author = "Steve Jobs"
            ),
            QuoteModel(
                quote = "In three words I can sum up everything I've learned about life: it goes on.",
                author = "Robert Frost"
            ),
            QuoteModel(
                quote = "The best way to predict the future is to create it.",
                author = "Peter Drucker"
            ),
            QuoteModel(
                quote = "The only thing we have to fear is fear itself.",
                author = "Franklin D. Roosevelt"
            ),
            QuoteModel(
                quote = "The only limit to our realization of tomorrow will be our doubts of today.",
                author = "Franklin D. Roosevelt"
            ),
            QuoteModel(
                quote = "The future belongs to those who believe in the beauty of their dreams.",
                author = "Eleanor Roosevelt"
            ),
            QuoteModel(
                quote = "The only true wisdom is in knowing you know nothing.",
                author = "Socrates"
            ),
            QuoteModel(
                quote = "The only thing we have to fear is fear itself.",
                author = "Franklin D. Roosevelt"
            ),
            QuoteModel(
                quote = "Regalame una Estrella :)",
                author = "taniariveradev"
            )
        )
    }
}