package com.umojafemspace.mpesa

class MpesaService {

    fun initiatePayment(
        phoneNumber: String,
        amount: Double
    ): Boolean {
        return phoneNumber.isNotEmpty() && amount > 0
    }
}
