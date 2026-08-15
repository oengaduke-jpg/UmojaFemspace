package com.umojafemspace.ui

data class LoanReviewActivity(
    val applicationId: String,
    val clientName: String,
    val amountRequested: Double,
    val loanType: String,
    val status: String
)
