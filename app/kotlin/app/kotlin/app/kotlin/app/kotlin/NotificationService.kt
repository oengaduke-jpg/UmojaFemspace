package com.umojafemspace.app

object NotificationService {

    fun loanApproved(clientName: String): String {
        return "Congratulations $clientName. Your loan has been approved."
    }

    fun loanRejected(clientName: String): String {
        return "Dear $clientName, your loan application was not approved."
    }

    fun repaymentReminder(clientName: String): String {
        return "Dear $clientName, your loan repayment is due. Kindly pay on time."
    }

    fun overdueNotice(clientName: String): String {
        return "Dear $clientName, your loan is overdue. Please make payment immediately."
    }
}
