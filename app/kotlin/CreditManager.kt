package com.umojafemspace.app

data class CreditManager(
    val managerId: String,
    val fullName: String,
    val phoneNumber: String,
    val email: String,
    val approvalLimit: Double,
    val employmentStatus: String
)
