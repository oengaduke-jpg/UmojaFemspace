package com.umojafemspace.app

data class ClientProfile(
    val clientId: String,
    val fullName: String,
    val nationalId: String,
    val phoneNumber: String,
    val county: String,
    val subCounty: String,
    val businessName: String,
    val monthlyIncome: Double,
    val accountStatus: String
)
