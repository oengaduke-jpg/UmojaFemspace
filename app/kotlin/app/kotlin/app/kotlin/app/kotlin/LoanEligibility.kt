package com.umojafemspace.app

data class LoanEligibility(
    val clientId: String,
    val kycVerified: Boolean,
    val hasActiveLoan: Boolean,
    val guarantorVerified: Boolean,
    val monthlyIncome: Double,
    val eligible: Boolean,
    val reason: String
)
