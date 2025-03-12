# Automation Exercise Project 🚀

![Automation Banner](https://img.shields.io/badge/Automation-Exercise-blueviolet?style=for-the-badge)  
**A Selenium-based test automation framework using SHAFT Engine to validate e-commerce workflows.**

---

## 📝 Project Overview

Welcome to the **Automation Exercise Project**! This repository contains a robust test automation suite designed to validate key functionalities of the [Automation Exercise](https://automationexercise.com/) e-commerce platform. Built with ❤️ using the **SHAFT Engine**, it leverages the power of Selenium WebDriver, TestNG, and the Page Object Model (POM) to ensure clean, maintainable, and scalable test scripts.

The project tests critical user journeys like product browsing, adding items to the cart, user registration, and more, ensuring a seamless shopping experience.

---

## ✨ Features

- **End-to-End Testing**: Covers core e-commerce workflows 📦.
- **SHAFT Engine**: Simplifies automation with its fluent API and smart waits ⏱️.
- **Page Object Model**: Organized, reusable page classes for better maintainability 🗂️.
- **TestNG**: Structured test execution with priorities and suite management 🧪.
- **Rich Reporting**: Detailed logs and screenshots via SHAFT’s Allure integration 📊.

---

## 🛠️ Technologies Used

| Tool/Framework       | Purpose                     | Version    |
|----------------------|-----------------------------|------------|
| **Java**            | Programming Language        | 11+        |
| **SHAFT Engine**    | Test Automation Framework   | 8.4.20241024 |
| **TestNG**          | Test Runner & Assertions    | 7.10.2     |
| **Selenium**        | Browser Automation          | Embedded in SHAFT |
| **Maven**           | Dependency Management       | 3.x        |

---

## 📋 Project Structure
AutomationExerciseProject/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── pages/                # Page Object classes
│   │   │       ├── AllProductsPage.java
│   │   │       ├── BasePage.java
│   │   │       ├── LoginPage.java
│   │   │       ├── ProductDetailsPage.java
│   │   │       ├── RegisterUserPage.java
│   │   │       └── ViewCartPage.java
│   │   └── resources/               # Configuration files
│   └── test/
│       └── java/                    # Test classes
│           ├── BaseClass.java       # Base setup for tests
│           ├── TestAddProductsInCart.java
│           ├── TestLoginUser.java
│           └── TestRegisterUser.java
├── pom.xml                          # Maven dependencies


---

## 🎯 Test Scenarios

### 1. **User Registration** ✅
- Validates user signup with valid/invalid data.
- Checks successful account creation and login redirection.

### 2. **Product Cart Management** 🛒
- Adds products (e.g., "Blue Top", "Men Tshirt") to the cart.
- Verifies product names and quantities in the cart.

### 3. **Login Functionality** 🔐
- Tests login with correct and incorrect credentials.
- Ensures proper error messages and successful login flows.

### 4. **Product Details** ℹ️
- Navigates to product details pages and verifies URLs/content.

---

## 🚀 Getting Started

### Prerequisites
- **Java JDK**: 11 or higher ☕
- **Maven**: Installed and configured 🛠️
- **IDE**: IntelliJ IDEA, Eclipse, or similar 🌐
- **Browser**: Chrome (default; configurable via SHAFT properties) 🌍

### Setup Instructions
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Paula967/AutomationExerciseProject.git
   cd AutomationExerciseProject

 👩‍💻 Author
Paula967
GitHub: Paula967
A passionate automation engineer crafting reliable test suites! ✨
📜 License
This project is licensed under the MIT License - see the LICENSE file for details.
