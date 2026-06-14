package com.umojafemspace.services

class AuthService {
    fun login(phone: String, password: String): Boolean {
        return phone.isNotEmpty() && password.isNotEmpty()
    }
}
