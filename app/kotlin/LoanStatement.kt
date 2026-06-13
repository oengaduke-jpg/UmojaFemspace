package com.umojafemspace.app

data class LoanStatement(
    val statementId: String,
    val loanId: String,
    val clientId: String,
    val loanAmount: Double,
    val amountPaid: Double,
    val outstandingBalance: Double,
    val penalties: Double,
    val loanStatus: String,
    val statementDate: String
)
