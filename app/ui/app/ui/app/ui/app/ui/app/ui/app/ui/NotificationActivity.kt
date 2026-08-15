package com.umojafemspace.ui

data class NotificationActivity(
    val notifications: List<String> = emptyList(),
    val unreadCount: Int = 0
)
