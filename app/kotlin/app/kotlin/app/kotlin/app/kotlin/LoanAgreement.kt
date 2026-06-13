package com.umojafemspace.app

data class LoanAgreement(
    val agreementId: String,
    val loanId: String,
    val clientId: String,
    val loanAmount: Double,
    val interestRate: Double,
    val repaymentFrequency: String,
    val loanTerm: Int,
    val agreementDate: String,
    val clientAccepted: Boolean
)
