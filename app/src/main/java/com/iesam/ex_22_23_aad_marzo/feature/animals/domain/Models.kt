package com.iesam.ex_22_23_aad_marzo.feature.animals.domain

data class Animal(val id: Int, val name: String, val type: AnimalType)
data class AnimalType(val type: String)