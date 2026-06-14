package com.umojafemspace.app

data class SystemSettings(
    val companyName: String,
    val slogan: String,
    val whatsappNumber: String,
    val facebookPage: String,
    val minimumLoanAmount: Double,
    val maximumLoanAmount: Double,
    val defaultInterestRate: Double
)
