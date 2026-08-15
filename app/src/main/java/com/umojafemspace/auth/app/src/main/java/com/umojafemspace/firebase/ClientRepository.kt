package com.umojafemspace.firebase

import com.google.firebase.firestore.FirebaseFirestore

class ClientRepository {

    private val db = FirebaseFirestore.getInstance()

    fun saveClient(
        clientId: String,
        fullName: String,
        nationalId: String,
        phoneNumber: String,
        businessName: String,
        monthlyIncome: Double
    ) {
        val client = hashMapOf(
            "fullName" to fullName,
            "nationalId" to nationalId,
            "phoneNumber" to phoneNumber,
            "businessName" to businessName,
            "monthlyIncome" to monthlyIncome,
            "kycVerified" to false,
            "status" to "ACTIVE"
        )

        db.collection("clients")
            .document(clientId)
            .set(client)
    }
}
