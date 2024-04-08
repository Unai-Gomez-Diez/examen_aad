package com.iesam.ex_22_23_aad_marzo.feature.animals.data.remote

import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalType

class AnimalRemoteDataSource {

    private val mockAnimals = listOf(
        Animal(1, "Tux", AnimalType("Gato")),
        Animal(2, "Dino", AnimalType("Perro")),
        Animal(3, "Bambam", AnimalType("Perro")),
        Animal(4, "Tango", AnimalType("Perro")),
        Animal(5, "Git", AnimalType("Gato"))
    )

    fun getAnimals(): List<Animal> = mockAnimals

    fun getAnimal(animalId: Int) = mockAnimals.firstOrNull { it.id == animalId }

}