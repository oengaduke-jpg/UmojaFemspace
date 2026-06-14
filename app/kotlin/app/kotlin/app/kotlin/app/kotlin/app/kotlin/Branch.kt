package com.umojafemspace.app

data class Branch(
    val branchId: String,
    val branchName: String,
    val county: String,
    val address: String,
    val phoneNumber: String,
    val managerName: String,
    val active: Boolean
)
