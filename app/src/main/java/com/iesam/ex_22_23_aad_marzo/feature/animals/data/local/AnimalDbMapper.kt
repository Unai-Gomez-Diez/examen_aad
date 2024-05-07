package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalType

fun AnimalEntity.toDomain(): Animal =
    Animal(
        this.id,
        this.name,
        this.type
    )



fun Animal.toEntity(): AnimalEntity =
    AnimalEntity(
        this.id,
        this.name,
        this.type
    )
