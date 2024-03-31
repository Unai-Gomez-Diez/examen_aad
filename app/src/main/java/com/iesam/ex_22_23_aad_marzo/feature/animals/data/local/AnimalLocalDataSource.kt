package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal

interface AnimalLocalDataSource {
    fun getAnimals(): List<Animal>
    fun deleteAnimals()

    fun saveAnimals(animals: List<Animal>)

    fun getAnimal(id: Int): Animal
}