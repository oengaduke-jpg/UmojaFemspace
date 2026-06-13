package com.umojafemspace.app

object PenaltyCalculator {

    fun calculateSmallLoanPenalty(
        missedInstallments: Int
    ): Double {
        return missedInstallments * 100.0
    }

    fun calculateLargeLoanPenalty(
        outstandingBalance: Double
    ): Double {
        return outstandingBalance * 0.02
    }
}
