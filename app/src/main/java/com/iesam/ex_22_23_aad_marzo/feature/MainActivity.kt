package com.iesam.ex_22_23_aad_marzo.feature

import android.content.Context
import android.os.Bundle
import android.text.NoCopySpan.Concrete
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.iesam.ex_22_23_aad_marzo.R
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.AnimalDataRepository
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.AppDatabase
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.AnimalDao
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.AnimalDbLocalDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.AnimalEntity
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.AnimalLocalDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.remote.AnimalRemoteDataSource

import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initAnimals(this)
        setContentView(R.layout.activity_main)
        findViewById<Button?>(R.id.action_delete_user).setOnClickListener {
            deleteLogin()
        }
        findViewById<Button?>(R.id.action_delete_animals).setOnClickListener {
            deleteAnimals(this)
        }
        initLogin()
        initAnimals(this)
        initAnimalDetail(1, this)
        initOffers()
    }

    private fun initLogin() {
        val email = "example@email.es"
        val password = "example_password"

        //Llamar al repositorio
        //LoginRepository loginRepository = ...
    }

    private fun deleteLogin() {
        //Eliminar datos del login.
    }

    private fun initAnimals(context: Context) {
        thread {

            val animalDataRepository = AnimalDataRepository(
                AnimalDbLocalDataSource(AppDatabase.getInstance(context).animalDao()),
                AnimalRemoteDataSource()
                )

            animalDataRepository.getAnimals()
        }
    }

    private fun initAnimalDetail(animalId: Int, context: Context) {
        thread {
            val animalDataRepository = AnimalDataRepository(
                AnimalDbLocalDataSource(AppDatabase.getInstance(context).animalDao()),
                AnimalRemoteDataSource()
            )

            animalDataRepository.getAnimal(animalId)
        }
    }

    private fun deleteAnimals(context: Context) {
        thread {
            val animalDataRepository = AnimalDataRepository(
                AnimalDbLocalDataSource(AppDatabase.getInstance(context).animalDao()),
                AnimalRemoteDataSource()
            )

            animalDataRepository.deleteAnimal()
        }
    }

    private fun initOffers() {
        thread {
            //Hacer la llamada al repositorio desde aquí.
        }
    }
}