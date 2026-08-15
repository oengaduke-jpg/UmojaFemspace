package com.umojafemspace.mpesa

class MpesaReceiptService {

    fun createReceipt(
        transactionCode: String,
        amount: Double
    ): String {
        return "M-Pesa transaction $transactionCode received: KES $amount"
    }
}
