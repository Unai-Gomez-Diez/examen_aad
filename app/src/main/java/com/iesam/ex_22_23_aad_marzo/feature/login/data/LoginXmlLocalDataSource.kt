package com.iesam.ex_22_23_aad_marzo.feature.login.data

import android.content.Context
import com.example.calcomanias_rocket.app.serialization.JsonSerialization
import com.iesam.ex_22_23_aad_marzo.feature.login.domain.User

class LoginXmlLocalDataSource(
    private val context: Context,
    private val jsonSerialization: JsonSerialization
    ): LoginLocalDataSource {
    private val sharedPref = context?.getSharedPreferences("Login", Context.MODE_PRIVATE)
    override fun setLogin(user: User) {
        sharedPref?.edit()?.apply{
            putString(
                "1",
                jsonSerialization.toJson(user, User::class.java)
            )
        }?.apply()
    }

    override fun getLogin(): User? {
        val mapLogin = sharedPref?.all as Map<String, String>
        val loginValues = mapLogin.values.toList()
        return if (loginValues.isNotEmpty()) {
            jsonSerialization.fromJson(loginValues[0], User::class.java)
        } else {
            null
        }
    }

    override fun deleteLogin() {
        sharedPref?.edit()?.clear()?.apply()
    }
}