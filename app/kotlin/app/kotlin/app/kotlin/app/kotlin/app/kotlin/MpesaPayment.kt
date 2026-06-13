package com.umojafemspace.app

data class MpesaPayment(
    val paymentId: String,
    val clientId: String,
    val loanId: String,
    val amount: Double,
    val phoneNumber: String,
    val transactionCode: String,
    val paymentDate: String,
    val status: String
)
