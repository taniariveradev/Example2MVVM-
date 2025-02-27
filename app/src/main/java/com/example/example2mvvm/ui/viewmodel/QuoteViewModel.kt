package com.example.example2mvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.example2mvvm.data.model.QuoteModel
import com.example.example2mvvm.data.model.QuoteProvider
import com.example.example2mvvm.domain.GetQuotesUseCase
import kotlinx.coroutines.launch

class QuoteViewModel : ViewModel() {

    // LiveData permite a nuestro Activity subscribirse a un modelo de datos y se llama automaticamente
    //cuando se realiza un cambio en el modelo
    val quoteModel = MutableLiveData<QuoteModel>()
    var getQuotesUseCase = GetQuotesUseCase()

    fun onCreate() {
        viewModelScope.launch {
            val result = getQuotesUseCase()
            if (!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
            }
        }

    }

    fun randomQuote() {
        //val currentQuote = QuoteProvider.random()
        // Cambiamos valor de LiveData
        //quoteModel.postValue(currentQuote)
    }
}