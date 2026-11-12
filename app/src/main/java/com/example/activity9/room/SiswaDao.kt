package com.example.activity9.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao // Jangan lupa tambahkan anotasi ini agar dikenali sebagai DAO oleh Room
interface SiswaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)

    @Query("SELECT * from tblSiswa ORDER BY nama ASC")
    fun getAllSiswa(): Flow<List<Siswa>>
}