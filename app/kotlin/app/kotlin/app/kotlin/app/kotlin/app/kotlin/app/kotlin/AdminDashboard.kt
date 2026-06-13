package com.umojafemspace.app

data class AdminDashboard(
    val totalClients: Int,
    val totalLoans: Int,
    val activeLoans: Int,
    val overdueLoans: Int,
    val totalRepayments: Double
)
