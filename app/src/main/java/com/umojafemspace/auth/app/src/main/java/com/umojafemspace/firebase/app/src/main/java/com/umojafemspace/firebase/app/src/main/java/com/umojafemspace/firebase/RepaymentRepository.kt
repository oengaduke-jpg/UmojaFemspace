package com.umojafemspace.firebase

import com.google.firebase.firestore.FirebaseFirestore

class RepaymentRepository {

    private val db = FirebaseFirestore.getInstance()

    fun recordRepayment(
        repaymentId: String,
        loanId: String,
        clientId: String,
        amountPaid: Double,
        paymentMethod: String,
        transactionCode: String,
        status: String = "COMPLETED"
    ) {
        val repayment = hashMapOf(
            "loanId" to loanId,
            "clientId" to clientId,
            "amountPaid" to amountPaid,
            "paymentMethod" to paymentMethod,
            "transactionCode" to transactionCode,
            "status" to status,
            "paymentDate" to com.google.firebase.firestore.FieldValue.serverTimestamp()
        )

        db.collection("repayments")
            .document(repaymentId)
            .set(repayment)
    }
}
