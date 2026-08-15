package com.umojafemspace.firebase

import com.google.firebase.firestore.FirebaseFirestore

class LoanRepository {

    private val db = FirebaseFirestore.getInstance()

    fun createLoan(
        loanId: String,
        clientId: String,
        loanType: String,
        amount: Double,
        interestRate: Double,
        repaymentFrequency: String,
        purpose: String
    ) {
        val loan = hashMapOf(
            "clientId" to clientId,
            "loanType" to loanType,
            "amount" to amount,
            "interestRate" to interestRate,
            "repaymentFrequency" to repaymentFrequency,
            "purpose" to purpose,
            "status" to "PENDING"
        )

        db.collection("loans")
            .document(loanId)
            .set(loan)
    }
}
