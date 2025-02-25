package com.example.example2mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.example2mvvm.model.QuoteModel
import com.example.example2mvvm.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    // LiveData permite a nuestro Activity subscribirse a un modelo de datos y se llama automaticamente
    //cuando se realiza un cambio en el modelo
    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        // Cambiamos valor de LiveData
        quoteModel.postValue(currentQuote)
    }
}