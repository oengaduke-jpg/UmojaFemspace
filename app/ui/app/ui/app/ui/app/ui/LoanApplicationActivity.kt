package com.umojafemspace.ui

data class LoanApplicationActivity(
    val loanType: String = "",
    val amount: Double = 0.0,
    val purpose: String = "",
    val repaymentPeriod: Int = 0
)
