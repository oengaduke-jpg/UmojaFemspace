package com.umojafemspace.app

data class Dashboard(
    val activeLoans: Int,
    val totalOutstanding: Double,
    val nextRepaymentDate: String,
    val notifications: Int
)
