package com.iesam.ex_22_23_aad_marzo.feature.login.data

import android.util.Log
import com.iesam.ex_22_23_aad_marzo.feature.login.domain.User

class LoginDataRepository(
    private val loginXmlLocalDataSource: LoginXmlLocalDataSource
) {
    fun deleteLogin(){
        loginXmlLocalDataSource.deleteLogin()
    }

    fun getLogin(user: User): User{
        val login=loginXmlLocalDataSource.getLogin()
        return if(login == null){
            loginXmlLocalDataSource.setLogin(user)
            user
        } else {
            Log.d("dev1", login.toString())
            login
        }
    }
}