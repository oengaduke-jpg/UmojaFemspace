package com.umojafemspace.ui

data class RepaymentActivity(
    val loanId: String,
    val amountDue: Double,
    val amountPaid: Double,
    val outstandingBalance: Double
)
