package com.umojafemspace.app

data class Notification(
    val notificationId: String,
    val clientId: String,
    val title: String,
    val message: String,
    val dateSent: String,
    val isRead: Boolean
)
