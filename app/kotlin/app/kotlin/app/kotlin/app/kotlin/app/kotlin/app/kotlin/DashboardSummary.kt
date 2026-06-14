package com.umojafemspace.app

data class DashboardSummary(
    val totalClients: Int,
    val totalLoans: Int,
    val totalRepayments: Double,
    val overdueLoans: Int
)
