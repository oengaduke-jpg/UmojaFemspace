package com.umojafemspace.app

data class Receipt(
    val receiptId: String,
    val clientId: String,
    val amount: Double,
    val transactionDate: String,
    val transactionType: String
)
