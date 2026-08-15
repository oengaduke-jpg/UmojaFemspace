package com.umojafemspace.ui

data class DashboardActivity(
    val clientName: String,
    val activeLoans: Int,
    val outstandingBalance: Double,
    val nextPayment: Double
)
