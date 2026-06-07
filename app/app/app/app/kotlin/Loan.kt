package com.umojafemspace.app

data class Loan(
    val loanId: String,
    val clientId: String,
    val loanType: String,
    val amountRequested: Double,
    val amountApproved: Double,
    val interestRate: Double,
    val repaymentFrequency: String,
    val loanStatus: String
)
