package com.iesam.ex_22_23_aad_marzo.feature.animals.data

import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.AnimalDbLocalDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.remote.AnimalRemoteDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal

class AnimalDataRepository(
    private val animalDbLocalDataSource: AnimalDbLocalDataSource,
    private val animalRemoteDataSource: AnimalRemoteDataSource
){
    suspend fun getAnimals():List<Animal>{
        val listAnimals = animalDbLocalDataSource.getAnimals()
        return if(listAnimals.isEmpty()){
            animalDbLocalDataSource.deleteAnimals()
            animalDbLocalDataSource.saveAnimals(animalRemoteDataSource.getAnimals())
            animalDbLocalDataSource.getAnimals()

        }else{
            listAnimals
        }
    }

    suspend fun getAnimal(id: Int): Animal{
        return animalDbLocalDataSource.getAnimal(id)
    }
}