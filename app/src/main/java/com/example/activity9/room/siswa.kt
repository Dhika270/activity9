package com.example.activity9.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tblSiswa")
data class Siswa(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0, // Diperbaiki dari 'int' menjadi 'Int'
    val nama: String,
    val alamat: String,
    val telpon: String
)