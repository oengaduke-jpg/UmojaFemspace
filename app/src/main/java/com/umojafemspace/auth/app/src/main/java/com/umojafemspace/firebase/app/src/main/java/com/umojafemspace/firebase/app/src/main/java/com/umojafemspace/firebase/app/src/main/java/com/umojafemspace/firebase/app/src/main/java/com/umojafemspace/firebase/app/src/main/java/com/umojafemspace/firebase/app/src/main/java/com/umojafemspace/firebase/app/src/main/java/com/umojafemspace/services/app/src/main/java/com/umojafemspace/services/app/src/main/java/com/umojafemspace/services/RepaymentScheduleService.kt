package com.umojafemspace.services

class RepaymentScheduleService {

    fun getFrequency(amount: Double): String {
        return when {
            amount <= 5000.0 -> "DAILY"
            amount < 50000.0 -> "WEEKLY"
            else -> "MONTHLY"
        }
    }
}
