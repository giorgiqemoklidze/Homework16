package com.example.homework16

import androidx.room.Room
import com.example.homework16.App.Companion.context

object DataBase {
    val db = Room.databaseBuilder(
        context!!,
        AppDatabase::class.java, "database-name"
    ).build()
}