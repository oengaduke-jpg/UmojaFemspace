package com.umojafemspace.app

data class CustomerSupport(
    val ticketId: String,
    val clientId: String,
    val subject: String,
    val message: String,
    val status: String,
    val createdDate: String,
    val assignedTo: String
)
