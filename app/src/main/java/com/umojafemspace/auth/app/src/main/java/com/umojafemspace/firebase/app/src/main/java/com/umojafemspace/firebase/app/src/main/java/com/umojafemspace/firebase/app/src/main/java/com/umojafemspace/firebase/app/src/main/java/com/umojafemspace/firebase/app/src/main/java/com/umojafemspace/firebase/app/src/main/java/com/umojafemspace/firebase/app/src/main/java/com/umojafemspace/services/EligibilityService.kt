package com.umojafemspace.services

class EligibilityService {

    fun isEligible(
        kycVerified: Boolean,
        hasActiveLoan: Boolean,
        guarantorVerified: Boolean
    ): Boolean {
        return kycVerified &&
                !hasActiveLoan &&
                guarantorVerified
    }
}
