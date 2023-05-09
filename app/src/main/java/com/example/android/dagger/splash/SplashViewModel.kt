package com.example.android.dagger.splash

import com.example.android.dagger.user.UserManager
import javax.inject.Inject

class SplashViewModel @Inject constructor(val userManager: UserManager) {

    fun successfulLogin(): Boolean {
        return userManager.isUserLoggedIn()
    }

    fun registrationRequired(): Boolean {
        return !userManager.isUserRegistered()
    }
}
