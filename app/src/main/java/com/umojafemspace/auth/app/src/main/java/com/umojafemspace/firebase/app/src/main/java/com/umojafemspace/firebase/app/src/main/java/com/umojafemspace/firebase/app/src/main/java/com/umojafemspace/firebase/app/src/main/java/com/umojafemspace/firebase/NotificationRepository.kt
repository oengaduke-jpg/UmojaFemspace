package com.umojafemspace.firebase

import com.google.firebase.firestore.FirebaseFirestore

class NotificationRepository {

    private val db = FirebaseFirestore.getInstance()

    fun createNotification(
        notificationId: String,
        clientId: String,
        title: String,
        message: String,
        type: String
    ) {
        val notification = hashMapOf(
            "clientId" to clientId,
            "title" to title,
            "message" to message,
            "type" to type,
            "read" to false,
            "status" to "ACTIVE",
            "createdAt" to com.google.firebase.firestore.FieldValue.serverTimestamp()
        )

        db.collection("notifications")
            .document(notificationId)
            .set(notification)
    }
}
