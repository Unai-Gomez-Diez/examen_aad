package com.iesam.ex_22_23_aad_marzo.feature.login.data

import com.iesam.ex_22_23_aad_marzo.feature.login.domain.User

interface LoginLocalDataSource {
    fun setLogin(user: User)
    fun getLogin(): User?
    fun deleteLogin()
}