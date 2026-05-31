# 🚀 Automation_ServiceNowBuild

> End-to-End ServiceNow Automation Framework built using Selenium, Java, TestNG, Maven, and Industry Standard Design Patterns.

![Java](https://img.shields.io/badge/Java-17-orange)
![Selenium](https://img.shields.io/badge/Selenium-Automation-green)
![TestNG](https://img.shields.io/badge/TestNG-Testing-red)
![Maven](https://img.shields.io/badge/Maven-Build-blue)
![GitHub](https://img.shields.io/badge/GitHub-Repository-black)

---

## 📌 Overview

Automation_ServiceNowBuild is a scalable and maintainable automation framework designed to automate ServiceNow business workflows and UI validations.

The framework follows industry best practices such as:

✅ Page Object Model (POM)

✅ Data-Driven Testing

✅ Reusable Components

✅ Configuration Management

✅ Detailed Reporting

✅ CI/CD Integration Ready

The objective is to reduce manual testing efforts, improve test coverage, and enable faster regression testing.

---

## 🎯 Key Features

### 🔹 UI Automation

* Automated ServiceNow UI workflows
* Form validations
* Record creation and updates
* Navigation testing

### 🔹 Framework Features

* Page Object Model (POM)
* Utility-based reusable methods
* Configurable test execution
* Screenshot capture on failures
* Environment-specific configuration
* Centralized test data management

### 🔹 Reporting

* Extent Reports
* TestNG Reports
* Execution Logs
* Failure Screenshots

### 🔹 Build & Dependency Management

* Maven Project Structure
* Easy dependency updates
* Modular architecture

---

## 🛠️ Technology Stack

| Technology            | Purpose                |
| --------------------- | ---------------------- |
| ☕ Java                | Programming Language   |
| 🌐 Selenium WebDriver | UI Automation          |
| 🧪 TestNG             | Test Execution         |
| 📦 Maven              | Dependency Management  |
| 📊 Extent Reports     | Reporting              |
| 🔄 Git                | Version Control        |
| 🚀 Jenkins            | CI/CD                  |
| ☁️ ServiceNow         | Application Under Test |

---

## 📂 Project Structure

```text
Automation_ServiceNowBuild
│
├── src/test/java
│   │
│   ├── pages
│   │     ├── LoginPage
│   │     ├── IncidentPage
│   │     └── RequestPage
│   │
│   ├── testcases
│   │     ├── LoginTest
│   │     ├── IncidentTest
│   │     └── RequestTest
│   │
│   ├── utilities
│   │     ├── ExcelUtils
│   │     ├── ScreenshotUtils
│   │     └── ReportUtils
│   │
│   ├── base
│   │     └── BaseTest
│   │
│   └── listeners
│         └── TestListener
│
├── src/test/resources
│   ├── config
│   └── testdata
│
├── testng.xml
├── pom.xml
└── README.md
```

---

## 🏗️ Framework Architecture

```text
                 ┌──────────────────┐
                 │   TestNG Suite   │
                 └────────┬─────────┘
                          │
                          ▼
                 ┌──────────────────┐
                 │    Test Cases    │
                 └────────┬─────────┘
                          │
                          ▼
                 ┌──────────────────┐
                 │  Page Objects    │
                 └────────┬─────────┘
                          │
                          ▼
                 ┌──────────────────┐
                 │ Utility Classes  │
                 └────────┬─────────┘
                          │
                          ▼
                 ┌──────────────────┐
                 │ Selenium Driver  │
                 └────────┬─────────┘
                          │
                          ▼
                 ┌──────────────────┐
                 │   ServiceNow UI  │
                 └──────────────────┘
```

---

## ⚙️ Prerequisites

Before running the framework ensure:

* Java 17+
* Maven Installed
* Chrome Browser
* IDE (Eclipse / IntelliJ)
* ServiceNow Instance Access
* Git Installed

Verify installation:

```bash
java -version
mvn -version
git --version
```

---

## 📥 Installation

### Clone Repository

```bash
git clone https://github.com/Vinothkumar-SV/Automation_ServiceNowBuild.git
```

### Navigate to Project

```bash
cd Automation_ServiceNowBuild
```

### Install Dependencies

```bash
mvn clean install
```

---

## ▶️ Execution

### Run Complete Suite

```bash
mvn test
```

### Run Specific TestNG Suite

```bash
mvn test -DsuiteXmlFile=testng.xml
```

### Clean Build

```bash
mvn clean
```

---

## 📊 Reporting

Reports are generated after execution.

### Available Reports

```text
📁 test-output/
📁 ExtentReports/
📁 Screenshots/
```

Reports include:

✅ Execution Summary

✅ Pass/Fail Statistics

✅ Failure Screenshots

✅ Detailed Logs

---

## 🔧 Configuration

Update application details in:

```text
config.properties
```

Example:

```properties
url=https://your-instance.service-now.com

username=admin

password=********
```

---

## 🧪 Sample Test Coverage

### Login Module

* Valid Login
* Invalid Login
* Logout Validation

### Incident Module

* Create Incident
* Update Incident
* Assign Incident
* Search Incident

### Service Request Module

* Create Request
* Update Request
* Verify Request Status

### User Management

* Create User
* Update User
* Search User

---

## 🔄 CI/CD Integration

The framework can be integrated with:

### 🚀 Jenkins

* Scheduled Execution
* Regression Runs
* Automated Reporting

### 🚀 GitHub Actions

* Pull Request Validation
* Automated Builds
* Continuous Testing

### 🚀 Azure DevOps

* Build Pipelines
* Release Pipelines

---

## 🌟 Best Practices Followed

✔️ Page Object Model

✔️ Reusable Components

✔️ Centralized Configuration

✔️ Separation of Concerns

✔️ Explicit Wait Strategy

✔️ Exception Handling

✔️ Reporting & Logging

✔️ Scalable Framework Design

---

## 🔮 Future Enhancements

### 📌 Planned Improvements

🔹 Integrate API Automation

🔹 Database Validation Support

🔹 Parallel Execution

🔹 Docker Containerization

🔹 Selenium Grid Integration

🔹 Cross Browser Execution

🔹 Cloud Execution (BrowserStack/SauceLabs)

🔹 Email Report Integration

🔹 Slack / Teams Notifications

🔹 AI-Powered Failure Analysis

🔹 Self-Healing Locators

🔹 BDD Framework using Cucumber

🔹 Playwright Migration Support

🔹 Data Generation using Faker Library

🔹 Advanced Dashboard Reporting

---

## 🤝 Contribution Guidelines

1. Fork the repository
2. Create feature branch
3. Commit changes
4. Raise Pull Request
5. Review & Merge

---

## 📈 Framework Benefits

🚀 Faster Regression Testing

🚀 Reduced Manual Effort

🚀 Better Test Coverage

🚀 Improved Reliability

🚀 Easy Maintenance

🚀 CI/CD Ready

🚀 Enterprise Scale Architecture



## 👨‍💻 Author

**Vinoth Kumar**

Senior Automation Engineer

🔗 GitHub:
https://github.com/Vinothkumar-SV

---

### ⭐ If you find this project useful, don't forget to Star the Repository!
