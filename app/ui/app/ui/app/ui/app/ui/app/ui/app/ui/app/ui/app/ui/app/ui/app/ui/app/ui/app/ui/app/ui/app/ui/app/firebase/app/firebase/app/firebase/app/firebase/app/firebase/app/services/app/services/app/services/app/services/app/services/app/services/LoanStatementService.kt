package com.umojafemspace.services

class LoanStatementService {

    fun calculateBalance(
        loanAmount: Double,
        amountPaid: Double,
        penalties: Double
    ): Double {
        return (loanAmount + penalties - amountPaid).coerceAtLeast(0.0)
    }
}
