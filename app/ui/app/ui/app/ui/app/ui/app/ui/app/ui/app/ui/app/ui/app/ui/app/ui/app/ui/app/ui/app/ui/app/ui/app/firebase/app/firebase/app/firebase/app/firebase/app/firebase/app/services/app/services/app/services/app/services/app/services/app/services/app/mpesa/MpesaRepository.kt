package com.umojafemspace.mpesa

class MpesaRepository {

    fun initiatePayment(
        phoneNumber: String,
        amount: Double
    ): Boolean {
        return phoneNumber.isNotBlank() && amount > 0
    }

    fun verifyTransaction(
        transactionCode: String
    ): Boolean {
        return transactionCode.isNotBlank()
    }
}
