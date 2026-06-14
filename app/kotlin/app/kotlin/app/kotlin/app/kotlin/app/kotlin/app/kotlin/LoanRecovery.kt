package com.umojafemspace.app

data class LoanRecovery(
    val recoveryId: String,
    val loanId: String,
    val clientId: String,
    val outstandingBalance: Double,
    val recoveryStatus: String
)
