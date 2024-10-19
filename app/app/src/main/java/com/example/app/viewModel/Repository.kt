package com.example.app.viewModel

import com.example.app.roomDB.Pessoa
import com.example.app.roomDB.PessoaDataBase

class Repository(private val db : PessoaDataBase) {
    suspend fun  upsertPessoa(pessoa: Pessoa){
        db.pessoaDao().upsertPessoa(pessoa)
    }

    suspend fun  deletePessoa(pessoa: Pessoa){
        db.pessoaDao().deletePessoa(pessoa)
    }

    fun getAllPessoa() = db.pessoaDao().getAllPessoa()
}