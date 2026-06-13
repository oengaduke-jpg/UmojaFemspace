package com.umojafemspace.app

data class KYCVerification(
    val verificationId: String,
    val clientId: String,
    val nationalId: String,
    val phoneNumber: String,
    val selfieVerified: Boolean,
    val idVerified: Boolean,
    val addressVerified: Boolean,
    val verificationStatus: String,
    val verificationDate: String
)
