package com.iesam.ex_22_23_aad_marzo.feature

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.iesam.ex_22_23_aad_marzo.feature.app.serialization.GsonSerialization
import com.google.gson.Gson
import com.iesam.ex_22_23_aad_marzo.R
import com.iesam.ex_22_23_aad_marzo.feature.login.data.LoginDataRepository
import com.iesam.ex_22_23_aad_marzo.feature.login.data.LoginXmlLocalDataSource
import com.iesam.ex_22_23_aad_marzo.feature.login.domain.User
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button?>(R.id.action_delete_user).setOnClickListener {
            deleteLogin()
        }
        findViewById<Button?>(R.id.action_delete_animals).setOnClickListener {
            deleteAnimals()
        }
        initLogin()
        initAnimals()
        initAnimalDetail(1)
        initOffers()

    }


    private fun initLogin() {
        val email = "example@email.es"
        val password = "example_password"

        //Llamar al repositorio
        //LoginRepository loginRepository = ...
        val user = User(email, password)

        val loginDataRepository: LoginDataRepository = LoginDataRepository(
            LoginXmlLocalDataSource(
            this@MainActivity,
            GsonSerialization(Gson()
        )
            ))
        loginDataRepository.getLogin(user)

    }

    private fun deleteLogin() {
        val loginDataRepository: LoginDataRepository = LoginDataRepository(
            LoginXmlLocalDataSource(
                this@MainActivity,
                GsonSerialization(Gson()
                )
            ))
        loginDataRepository.deleteLogin()
    }

    private fun initAnimals() {
        thread {
            //Ejecutar código para obtener animales
        }
    }

    private fun initAnimalDetail(animalId: Int) {
        thread {
            //Ejecutar código para obtener un animal en concreto
        }
    }

    private fun deleteAnimals() {
        thread {
            //Elimino los animales de local..
        }
    }

    private fun initOffers() {
        thread {
            //Hacer la llamada al repositorio desde aquí.
        }
    }
}