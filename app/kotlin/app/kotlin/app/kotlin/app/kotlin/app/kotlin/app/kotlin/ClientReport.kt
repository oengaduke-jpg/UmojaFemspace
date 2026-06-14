package com.umojafemspace.app

data class ClientReport(
    val reportId: String,
    val totalClients: Int,
    val activeClients: Int,
    val reportDate: String
)
