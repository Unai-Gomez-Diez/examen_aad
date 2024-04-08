package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalType

@Entity(tableName = "animal")
data class AnimalEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @TypeConverters(AnimalTypeConverter::class) val type: AnimalType
)
data class AnimalTypeEntity(
     val type: String
)