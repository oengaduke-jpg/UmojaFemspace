package com.umojafemspace.app

data class SavingsAccount(
    val accountId: String,
    val clientId: String,
    val balance: Double,
    val dateOpened: String,
    val status: String
)
