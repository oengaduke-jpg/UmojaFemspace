package com.umojafemspace.firebase

import com.google.firebase.firestore.FirebaseFirestore

class GuarantorRepository {

    private val db = FirebaseFirestore.getInstance()

    fun saveGuarantor(
        guarantorId: String,
        clientId: String,
        fullName: String,
        nationalId: String,
        phoneNumber: String,
        relationship: String
    ) {
        val guarantor = hashMapOf(
            "clientId" to clientId,
            "fullName" to fullName,
            "nationalId" to nationalId,
            "phoneNumber" to phoneNumber,
            "relationship" to relationship,
            "verified" to false,
            "status" to "PENDING"
        )

        db.collection("guarantors")
            .document(guarantorId)
            .set(guarantor)
    }
}
