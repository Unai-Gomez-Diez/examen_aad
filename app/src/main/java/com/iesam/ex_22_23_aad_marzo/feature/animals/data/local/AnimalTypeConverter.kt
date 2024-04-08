package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalType

@ProvidedTypeConverter
class AnimalTypeConverter {
    @TypeConverter
    fun fromAnimalType(animalType: AnimalType): String {
        return Gson().toJson(animalType)
    }

    @TypeConverter
    fun toAnimalType(animal: String): AnimalType {
        return Gson().fromJson(animal, AnimalType::class.java)
    }
}