package com.umojafemspace.ui

data class DashboardScreen(
    val totalLoans: Int,
    val activeLoans: Int,
    val overdueLoans: Int,
    val totalRepayments: Double
)
