package com.umojafemspace.app

data class Transaction(
    val transactionId: String,
    val clientId: String,
    val loanId: String,
    val transactionType: String,
    val amount: Double,
    val transactionDate: String,
    val referenceNumber: String,
    val status: String
)
