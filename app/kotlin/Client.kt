package com.umojafemspace.app

data class Client(
    val clientId: String,
    val fullName: String,
    val nationalId: String,
    val phoneNumber: String,
    val county: String,
    val businessName: String,
    val accountStatus: String
)
