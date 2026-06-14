package com.umojafemspace.app

data class LoanRecoveryAction(
    val actionId: String,
    val recoveryId: String,
    val actionTaken: String,
    val actionDate: String,
    val officerId: String
)
