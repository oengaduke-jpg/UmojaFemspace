package com.umojafemspace.services

class LoanApprovalService {

    fun isAmountValid(amount: Double): Boolean {
        return amount in 2000.0..100000.0
    }

    fun approve(amount: Double): Boolean {
        return isAmountValid(amount)
    }
}
