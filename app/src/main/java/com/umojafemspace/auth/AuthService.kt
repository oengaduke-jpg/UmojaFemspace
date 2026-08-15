package com.umojafemspace.auth

import com.google.firebase.auth.FirebaseAuth

class AuthService {

    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    fun currentUserId(): String? {
        return auth.currentUser?.uid
    }

    fun isLoggedIn(): Boolean {
        return auth.currentUser != null
    }

    fun logout() {
        auth.signOut()
    }
}
