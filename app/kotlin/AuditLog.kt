package com.umojafemspace.app

data class AuditLog(
    val logId: String,
    val userId: String,
    val userRole: String,
    val action: String,
    val targetId: String,
    val timestamp: String,
    val details: String
)
