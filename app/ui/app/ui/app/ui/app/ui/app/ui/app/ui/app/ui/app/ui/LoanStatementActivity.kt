package com.umojafemspace.ui

data class LoanStatementActivity(
    val loanId: String,
    val loanAmount: Double,
    val amountPaid: Double,
    val balance: Double,
    val penalties: Double
)
