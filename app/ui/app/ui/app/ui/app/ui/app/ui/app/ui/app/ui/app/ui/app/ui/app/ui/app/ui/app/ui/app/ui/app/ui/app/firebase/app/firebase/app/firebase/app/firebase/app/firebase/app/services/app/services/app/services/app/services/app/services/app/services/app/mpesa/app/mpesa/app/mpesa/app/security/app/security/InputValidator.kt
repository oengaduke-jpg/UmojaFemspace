package com.umojafemspace.security

object InputValidator {

    fun validPhone(phone: String): Boolean {
        return phone.matches(Regex("^\\+2547\\d{8}$"))
    }

    fun validLoanAmount(amount: Double): Boolean {
        return amount in 2000.0..100000.0
    }
}
