package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal

class AnimalDbLocalDataSource(private val animalDao: AnimalDao)
    :AnimalLocalDataSource{
    override fun getAnimals(): List<Animal> {
        val animals = animalDao.getAll()
        return if (animals.isEmpty()){
            emptyList()
        }else{
            animals.map {
                it.toDomain()
            }
        }
    }

    override fun deleteAnimals() {
        animalDao.deleteAll()
    }

    override fun saveAnimals(animals: List<Animal>) {
        val entity = animals.map {
            it.toEntity()
        }
        animalDao.save(*entity.toTypedArray())
    }

    override fun getAnimal(id: Int): Animal {
        val animalEntity = animalDao.getAnimalById(id)
        return animalEntity?.toDomain() ?: throw NoSuchElementException("Animal not found with id: $id")
    }
}