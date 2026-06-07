package com.umojafemspace.app

data class LoanDisbursement(
    val loanId: String,
    val amount: Double,
    val method: String,
    val disbursementDate: String
)
