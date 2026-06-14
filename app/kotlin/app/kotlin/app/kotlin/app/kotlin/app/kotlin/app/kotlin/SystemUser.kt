package com.umojafemspace.app

data class SystemUser(
    val userId: String,
    val username: String,
    val email: String,
    val role: String,
    val active: Boolean
)
