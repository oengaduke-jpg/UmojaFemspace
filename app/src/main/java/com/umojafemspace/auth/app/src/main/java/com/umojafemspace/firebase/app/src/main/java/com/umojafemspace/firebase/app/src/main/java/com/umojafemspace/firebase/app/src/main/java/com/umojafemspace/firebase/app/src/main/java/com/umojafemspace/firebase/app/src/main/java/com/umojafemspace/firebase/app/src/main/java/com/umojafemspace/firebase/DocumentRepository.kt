package com.umojafemspace.firebase

import com.google.firebase.firestore.FirebaseFirestore

class DocumentRepository {

    private val db = FirebaseFirestore.getInstance()

    fun saveDocument(
        documentId: String,
        clientId: String,
        documentType: String,
        fileName: String,
        uploadedBy: String
    ) {
        val document = hashMapOf(
            "clientId" to clientId,
            "documentType" to documentType,
            "fileName" to fileName,
            "status" to "PENDING",
            "uploadedBy" to uploadedBy,
            "uploadedAt" to com.google.firebase.firestore.FieldValue.serverTimestamp()
        )

        db.collection("documents")
            .document(documentId)
            .set(document)
    }
}
