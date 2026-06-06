# UMOJA FEMSPACE DATABASE STRUCTURE

## CLIENTS

Fields:
- clientId
- fullName
- nationalId
- phoneNumber
- dateOfBirth
- gender
- maritalStatus
- county
- subCounty
- address
- businessName
- monthlyIncome
- registrationDate
- accountStatus

---

## LOANS

Fields:
- loanId
- clientId
- loanProduct
- amountRequested
- amountApproved
- interestRate
- repaymentPeriod
- applicationDate
- approvalDate
- disbursementDate
- loanStatus
- outstandingBalance

---

## GUARANTORS

Fields:
- guarantorId
- clientId
- fullName
- phoneNumber
- nationalId
- relationship
- verificationStatus

---

## REPAYMENTS

Fields:
- repaymentId
- loanId
- clientId
- amountPaid
- paymentMethod
- transactionCode
- paymentDate
- receiptNumber

---

## STAFF

Fields:
- staffId
- fullName
- role
- phoneNumber
- email
- accountStatus

---

## NOTIFICATIONS

Fields:
- notificationId
- clientId
- title
- message
- dateSent
- status
