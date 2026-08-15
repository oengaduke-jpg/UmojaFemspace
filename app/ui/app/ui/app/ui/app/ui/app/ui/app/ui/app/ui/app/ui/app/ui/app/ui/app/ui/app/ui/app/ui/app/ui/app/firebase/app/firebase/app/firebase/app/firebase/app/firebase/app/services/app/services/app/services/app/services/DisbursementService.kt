package com.umojafemspace.services

class DisbursementService {

    fun validateAmount(amount: Double): Boolean {
        return amount in 2000.0..100000.0
    }
}
