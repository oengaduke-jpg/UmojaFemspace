package com.umojafemspace.firebase

import com.google.firebase.firestore.FirebaseFirestore

class StaffRepository {

    private val db = FirebaseFirestore.getInstance()

    fun saveStaff(
        staffId: String,
        fullName: String,
        phoneNumber: String,
        role: String,
        branchId: String
    ) {
        val staff = hashMapOf(
            "fullName" to fullName,
            "phoneNumber" to phoneNumber,
            "role" to role,
            "branchId" to branchId,
            "status" to "ACTIVE"
        )

        db.collection("staff").document(staffId).set(staff)
    }
}
