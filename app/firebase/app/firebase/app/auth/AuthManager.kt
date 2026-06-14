package com.umojafemspace.auth

class AuthManager {

    fun login(phoneNumber: String, password: String): Boolean {
        return phoneNumber.isNotEmpty() && password.isNotEmpty()
    }

    fun register(phoneNumber: String): Boolean {
        return phoneNumber.isNotEmpty()
    }
}
