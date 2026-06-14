package com.umojafemspace.app

data class LoanReport(
    val reportId: String,
    val totalLoans: Int,
    val activeLoans: Int,
    val overdueLoans: Int,
    val reportDate: String
)
