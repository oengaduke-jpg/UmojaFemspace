package com.umojafemspace.services

class LoanStatementService {

    fun calculateOutstanding(
        principal: Double,
        interest: Double,
        penalties: Double,
        paid: Double
    ): Double {
        return (principal + interest + penalties - paid)
            .coerceAtLeast(0.0)
    }
}
