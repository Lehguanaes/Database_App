package com.example.appaula.roomDB

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.appaula.roomDB.Pessoa
import kotlinx.coroutines.flow.Flow

@Dao
interface PessoaDao {

    @Upsert
    suspend fun upsertPessoa(pessoa: Pessoa)

    @Delete
    suspend fun deletePessoa(pessoa: Pessoa)

    @Query("SELECT * FROM Pessoa")
    fun getAllPessoa(): Flow<List<Pessoa>>
}