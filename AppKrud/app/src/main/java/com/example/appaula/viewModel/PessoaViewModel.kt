package com.example.appaula.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.appaula.roomDB.Pessoa
import kotlinx.coroutines.launch

open class PessoaViewModel(private val repository: Repository) : ViewModel() {
    open fun getPessoa() = repository.getAllPessoa()?.asLiveData(viewModelScope.coroutineContext)

    fun upsertPessoa(pessoa: Pessoa){
        viewModelScope.launch {
            repository.upsertPessoa(pessoa)
        }
    }

    open fun deletePessoa(pessoa: Pessoa){
        viewModelScope.launch {
            repository.deletePessoa(pessoa)
        }
    }
}