package com.umojafemspace.services

class PenaltyService {

    fun calculatePenalty(
        loanAmount: Double,
        missedInstallment: Boolean,
        daysLate: Int
    ): Double {

        if (!missedInstallment) return 0.0

        return if (loanAmount < 5000.0) {
            if (daysLate >= 7) 100.0 else 0.0
        } else {
            if (daysLate > 0) loanAmount * 0.02 else 0.0
        }
    }
}
