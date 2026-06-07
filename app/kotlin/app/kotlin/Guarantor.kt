package com.umojafemspace.app

data class Guarantor(
    val guarantorId: String,
    val clientId: String,
    val fullName: String,
    val nationalId: String,
    val phoneNumber: String,
    val relationship: String,
    val verificationStatus: String
)
