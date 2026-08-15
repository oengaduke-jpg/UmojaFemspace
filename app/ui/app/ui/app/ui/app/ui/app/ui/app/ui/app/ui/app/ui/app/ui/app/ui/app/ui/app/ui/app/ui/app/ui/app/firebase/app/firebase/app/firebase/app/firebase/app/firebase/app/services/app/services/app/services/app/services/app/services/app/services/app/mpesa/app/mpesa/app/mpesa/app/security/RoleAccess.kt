package com.umojafemspace.security

object RoleAccess {

    fun canApproveLoan(role: String): Boolean {
        return role == "CREDIT_MANAGER" ||
                role == "ADMIN" ||
                role == "SUPER_ADMIN"
    }

    fun canManageStaff(role: String): Boolean {
        return role == "ADMIN" || role == "SUPER_ADMIN"
    }
}
