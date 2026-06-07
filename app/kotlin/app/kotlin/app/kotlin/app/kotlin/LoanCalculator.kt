package com.umojafemspace.app

object LoanCalculator {

    fun calculateTotalRepayment(
        amount: Double,
        interestRate: Double = 20.0
    ): Double {
        return amount + (amount * interestRate / 100)
    }

    fun calculateDailyInstallment(
        amount: Double,
        days: Int
    ): Double {
        return calculateTotalRepayment(amount) / days
    }

    fun calculateWeeklyInstallment(
        amount: Double,
        weeks: Int
    ): Double {
        return calculateTotalRepayment(amount) / weeks
    }

    fun calculateMonthlyInstallment(
        amount: Double,
        months: Int
    ): Double {
        return calculateTotalRepayment(amount) / months
    }
}
