package com.umojafemspace.firebase

import com.google.firebase.firestore.FirebaseFirestore

class BranchRepository {

    private val db = FirebaseFirestore.getInstance()

    fun saveBranch(
        branchId: String,
        branchName: String,
        county: String
    ) {
        val branch = hashMapOf(
            "branchName" to branchName,
            "county" to county,
            "status" to "ACTIVE"
        )

        db.collection("branches").document(branchId).set(branch)
    }
}
