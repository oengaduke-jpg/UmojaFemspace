package com.umojafemspace.ui

data class LoanApplicationScreen(
    val clientId: String,
    val loanType: String,
    val amountRequested: Double,
    val purpose: String
)
