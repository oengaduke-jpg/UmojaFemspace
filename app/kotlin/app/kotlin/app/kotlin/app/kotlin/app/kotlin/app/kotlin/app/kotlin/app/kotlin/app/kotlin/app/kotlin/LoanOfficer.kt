package com.umojafemspace.app

data class LoanOfficer(
    val officerId: String,
    val fullName: String,
    val phoneNumber: String,
    val email: String,
    val assignedRegion: String,
    val activeClients: Int,
    val employmentStatus: String
)
