package com.umojafemspace.app

data class LoanProduct(
    val productId: String,
    val productName: String,
    val minimumAmount: Double,
    val maximumAmount: Double,
    val interestRate: Double,
    val repaymentFrequency: String,
    val active: Boolean
)
