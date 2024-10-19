package com.example.appaula.roomDB

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.appaula.roomDB.Pessoa

@Database(
    entities = [Pessoa::class],
    version = 1
)
abstract  class PessoaDataBase : RoomDatabase() {
    abstract fun pessoaDao() : PessoaDao
}
