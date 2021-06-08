package com.example.homework16

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true) val uid: Int = 0,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastName: String?,
    @ColumnInfo(name = "age") val age: String?,
    @ColumnInfo(name = "adress") val adress: String?,
    @ColumnInfo(name = "height") val height: String?,
    @ColumnInfo(name = "profile") val profile: String?,
    @ColumnInfo(name = "id") val id: String?


) {
    constructor(firstName: String?,lastName: String?,age: String?,adress: String?,height: String?,profile: String?,id: String?) :
            this(0,firstName,lastName,age,adress,height,profile,id)
}