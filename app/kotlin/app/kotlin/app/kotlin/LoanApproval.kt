package com.umojafemspace.app

data class LoanApproval(
    val applicationId: String,
    val approvedAmount: Double,
    val approvedBy: String,
    val approvalDate: String,
    val status: String
)
