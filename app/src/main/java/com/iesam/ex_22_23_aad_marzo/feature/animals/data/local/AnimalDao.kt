package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal

@Dao
interface AnimalDao {
    @Query("SELECT * FROM animal")
    fun getAll(): List<AnimalEntity>

    @Query("SELECT * FROM animal WHERE id = :id")
    fun getAnimalById(id: Int): AnimalEntity?

    @Query("DELETE FROM animal")
    fun deleteAll()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(vararg animalEntity: AnimalEntity)
}