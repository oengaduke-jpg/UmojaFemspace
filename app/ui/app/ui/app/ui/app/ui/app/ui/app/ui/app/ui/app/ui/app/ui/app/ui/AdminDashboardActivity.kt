package com.umojafemspace.ui

data class AdminDashboardActivity(
    val totalClients: Int,
    val totalLoans: Int,
    val activeLoans: Int,
    val overdueLoans: Int,
    val totalOutstanding: Double
)
