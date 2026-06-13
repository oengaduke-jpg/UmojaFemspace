package com.umojafemspace.app

data class CollectionOfficer(
    val officerId: String,
    val fullName: String,
    val phoneNumber: String,
    val email: String,
    val assignedRegion: String,
    val activeCases: Int,
    val employmentStatus: String
)
