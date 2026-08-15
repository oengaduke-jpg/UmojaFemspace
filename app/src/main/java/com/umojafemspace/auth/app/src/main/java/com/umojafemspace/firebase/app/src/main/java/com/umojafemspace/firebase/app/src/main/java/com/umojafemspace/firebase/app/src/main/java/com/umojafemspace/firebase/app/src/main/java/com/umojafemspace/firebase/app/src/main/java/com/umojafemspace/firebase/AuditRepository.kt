package com.umojafemspace.firebase

import com.google.firebase.firestore.FirebaseFirestore

class AuditRepository {

    private val db = FirebaseFirestore.getInstance()

    fun logAction(
        auditId: String,
        userId: String,
        userRole: String,
        action: String,
        targetId: String,
        details: String
    ) {
        val log = hashMapOf(
            "userId" to userId,
            "userRole" to userRole,
            "action" to action,
            "targetId" to targetId,
            "details" to details,
            "timestamp" to com.google.firebase.firestore.FieldValue.serverTimestamp()
        )

        db.collection("auditLogs")
            .document(auditId)
            .set(log)
    }
}
