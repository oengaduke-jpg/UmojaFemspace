package com.umojafemspace.app

data class LoanApplication(
    val applicationId: String,
    val clientId: String,
    val loanType: String,
    val amountRequested: Double,
    val purpose: String,
    val repaymentPeriod: Int,
    val status: String
)
