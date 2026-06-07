# FIREBASE COLLECTIONS

## clients
Stores client records.

Fields:
- clientId
- fullName
- nationalId
- phoneNumber
- accountStatus

---

## loans
Stores loan applications and active loans.

Fields:
- loanId
- clientId
- loanType
- amountRequested
- amountApproved
- interestRate
- repaymentFrequency
- loanStatus

---

## repayments
Stores repayment transactions.

Fields:
- repaymentId
- loanId
- amountPaid
- paymentDate
- transactionCode

---

## guarantors
Stores guarantor information.

Fields:
- guarantorId
- clientId
- fullName
- phoneNumber
- nationalId

---

## notifications
Stores messages sent to clients.

Fields:
- notificationId
- clientId
- title
- message
- dateSent
