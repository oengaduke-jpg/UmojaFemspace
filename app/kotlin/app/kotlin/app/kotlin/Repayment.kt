package com.umojafemspace.app

data class Repayment(
    val repaymentId: String,
    val loanId: String,
    val clientId: String,
    val amountPaid: Double,
    val paymentDate: String,
    val transactionCode: String
)
