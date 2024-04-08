package com.iesam.ex_22_23_aad_marzo.feature.animals.data

import android.util.Log
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.AnimalDbLocalDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.remote.AnimalRemoteDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal

class AnimalDataRepository(
    private val animalDbLocalDataSource: AnimalDbLocalDataSource,
    private val animalRemoteDataSource: AnimalRemoteDataSource
){
    fun getAnimals():List<Animal>{
        val listAnimals = animalDbLocalDataSource.getAnimals()
        return if(listAnimals.isEmpty()){
            animalDbLocalDataSource.deleteAnimals()
            animalDbLocalDataSource.saveAnimals(animalRemoteDataSource.getAnimals())
            animalDbLocalDataSource.getAnimals()

        }else{
            listAnimals
        }
    }

    fun getAnimal(id: Int): Animal{
        val animal = animalDbLocalDataSource.getAnimal(id)
        Log.d("@dev", animal.toString() )
        return animal
    }

    fun deleteAnimal(){
        animalDbLocalDataSource.deleteAnimals()
    }
}