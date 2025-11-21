Here is the `README.md` for the **Human Resources** domain.

I have structured this document to highlight the sensitivity of this domain. Unlike "Vehicles" or "Parts," this domain deals with people, salaries, and private data, so the documentation emphasizes security and privacy alongside the technical mechanics.

-----

# Human Resources (HR)

Welcome to the **Human Resources** domain.

[Image of organizational chart structure]

If you are new to the system, think of this domain as the **"Payroll Office & File Room."**

While the **[Identity Domain](https://www.google.com/search?q=../domains/party_identity/README.md)** handles *who* a person is (Name, Address), the **HR Domain** handles *how they work for us*. This is where we store sensitive contracts, track how many hours they worked, and most importantly, calculate their paychecks.

-----

## 📂 How to Navigate This Directory

We have organized the information to separate sensitive personnel data from operational time-tracking and payroll execution.

| Folder / Path | Description | Best For... |
| :--- | :--- | :--- |
| **[`/api`](https://www.google.com/search?q=./api)** | **The Data Definitions.** Schemas for Employee Records, Time Cards, and Pay Stubs. | Developers integrating with payroll providers. |
| **[`/specs`](https://www.google.com/search?q=./specs)** | **The Business Rules.** Logic for calculating overtime, tax deductions, and vacation accrual. | Business Analysts and HR Managers. |
| **[`/examples`](https://www.google.com/search?q=./examples)** | **Sample Data.** Anonymized examples of payroll runs and time sheets. | Testers (Note: No real PII is stored here). |
| **[`/model_diagrams`](https://www.google.com/search?q=./model_diagrams)** | **Visual Maps.** Workflows showing how a "Clock Out" event eventually becomes a bank deposit. | Architects and Process Auditors. |

-----

## 🗄️ Core Concepts (The API)

In the **[`/api`](https://www.google.com/search?q=./api)** folder, you will find the definitions that manage our workforce.

### 1\. The Employee Record

* **[`personnel_record`](https://www.google.com/search?q=./api/personnel_record)**: The sensitive "Dossier." It contains salary info, tax withholding settings, social security numbers (encrypted), and bank account details.
* **[`staff_member`](https://www.google.com/search?q=./api/staff_member)**: The operational view of the employee used within HR. It links back to the global **Identity** system.

### 2\. Time & Attendance

* **[`time_attendance`](https://www.google.com/search?q=./api/time_attendance)**: The raw data of working hours. This captures clock-in/clock-out times, breaks, and PTO (Paid Time Off) requests.
    * *Note:* Mechanics in the **Service Domain** flag time against specific cars; that data flows here to calculate efficiency and pay.

### 3\. The Payroll Engine

This is the most complex engine in the domain. It converts "Time" into "Money."

* **[`payroll_cycle`](https://www.google.com/search?q=./api/payroll_cycle)**: Defines the schedule (e.g., "Bi-Weekly Technicians," "Monthly Sales Managers"). It dictates *when* people get paid.
* **[`payroll_run`](https://www.google.com/search?q=./api/payroll_run)**: The execution event. It gathers all time cards, applies the rules, and calculates the final totals.
* **[`payroll_stub`](https://www.google.com/search?q=./api/payroll_stub)**: The output for the employee. A detailed breakdown of Gross Pay, Taxes, Benefits Deductions, and Net Pay.

-----

## 🔄 Critical Workflows (The Specs)

The **[`/specs`](https://www.google.com/search?q=./specs)** folder details the strict compliance logic we must follow.

* **Compensation Logic:** How we handle different pay types (Hourly vs. Salary vs. Commission).
* **Commission Integration:** How sales performance data from the **Sales Domain** is converted into commission bonuses in the `Payroll Run`.
* **Compliance & Audit:** Rules regarding data retention and access logs (Who looked at the CEO's salary?).

-----

## 🔗 Domain Relationships

HR sits between the "Operations" (people working) and "Finance" (people getting paid).

* **Identity (PIM):** We rely on **[Party & Identity](https://www.google.com/search?q=../domains/party_identity/README.md)** for the core user profile. If a staff member changes their legal name, it updates in PIM and flows here.
* **Finance:**
    * **[`Payroll Payment`](https://www.google.com/search?q=../finance/api/payment)**: HR *calculates* the money, but Finance *sends* the money.
    * **Journal Entries:** Every `Payroll Run` creates a massive Journal Entry in Finance to record labor costs against the correct department budgets.
* **Sales & Service:** These domains send performance data (Sold Cars, Flagged Hours) to HR to calculate commissions and bonuses.

[Image of HR to Finance data flow]

-----

## 🚀 Getting Started Checklist

**⚠️ Security Warning:** Access to this domain often requires elevated permissions due to PII (Personally Identifiable Information).

1.  **Understand the Link:** Look at **[`staff_member`](https://www.google.com/search?q=./api/staff_member)** to see how we link a generic User ID to an HR role.
2.  **Trace the Money:** Review **[`payroll_run`](https://www.google.com/search?q=./api/payroll_run)** to understand how we aggregate time cards into a single payment event.
3.  **Review the Schedule:** Check **[`payroll_cycle`](https://www.google.com/search?q=./api/payroll_cycle)** to understand the timing of our financial obligations.

*For access to real production data, you must have specific clearance from the Chief People Officer.*