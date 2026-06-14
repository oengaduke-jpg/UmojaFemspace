package com.umojafemspace.app

data class MpesaTransaction(
    val transactionId: String,
    val amount: Double,
    val phoneNumber: String,
    val transactionCode: String,
    val transactionDate: String
)
