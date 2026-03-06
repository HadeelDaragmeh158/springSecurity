# 🏦 EazyBank - Spring Security Demo

A **Spring Boot project** that demonstrates the internal **authentication flow of Spring Security** and how requests pass through the security infrastructure before accessing protected resources.

This project was built as part of learning **Spring Security fundamentals** and understanding how authentication works internally inside the framework.

---

# 🚀 Features

* Spring Boot REST application
* Spring Security authentication flow
* Demonstrates security filters chain
* AuthenticationManager & AuthenticationProvider
* UserDetailsService implementation
* Password encoding mechanism
* Colored logging configuration for better debugging

---

# 🧰 Tech Stack

| Technology      | Description                    |
| --------------- | ------------------------------ |
| Java 17         | Programming Language           |
| Spring Boot     | Backend Framework              |
| Spring Security | Authentication & Authorization |
| Spring MVC      | Web layer                      |
| Maven           | Dependency Management          |
| IntelliJ IDEA   | Development Environment        |

---

# 📂 Project Structure

```
src
 └─ main
     ├─ java
     │   └─ com.sp.secu
     │        ├─ controller
     │        │     └─ HomeController.java
     │        │
     │        └─ EazyBankApplication.java
     │
     └─ resources
          ├─ static
          ├─ templates
          └─ application.properties
```

---

# 🔐 Spring Security Authentication Flow

The diagram below illustrates how **Spring Security processes authentication internally**.

![Spring Security Flow](a_flowchart_diagram_illustrates_the_internal_flow.png)

### Flow Explanation

1. The **Client** sends a request with credentials.
2. The request enters the **Spring Security Filter Chain**.
3. The **AuthenticationManager** receives the authentication request.
4. The **AuthenticationProvider** validates the credentials.
5. The **UserDetailsService** loads the user information.
6. The **PasswordEncoder** verifies the password.
7. If authentication succeeds:

   * A **SecurityContext** is created
   * The user gains access to protected endpoints.
8. If authentication fails:

   * The system returns **401 Unauthorized** or **403 Forbidden**.

---

# ⚙️ Logging Configuration

The project uses **custom logging patterns** to improve debugging visibility during development.

Example configuration:

```
logging.pattern.console=%green(%d{yyyy-MM-dd HH:mm:ss.SSS}) %highlight(%-5level) %cyan(%logger{36}) %yellow([%thread]) - %msg%n

logging.level.root=DEBUG
logging.level.org.springframework=DEBUG
logging.level.org.springframework.web=DEBUG
logging.level.org.hibernate=DEBUG
logging.level.com.sp=DEBUG

spring.output.ansi.enabled=always
```

This configuration provides:

* colored logs
* visible errors
* detailed debugging information
* better development experience

---

# ▶️ Running The Project

### 1️⃣ Clone the repository

```
git clone https://github.com/your-username/eazybank-security.git
```

---

### 2️⃣ Navigate to project folder

```
cd eazybank-security
```

---

### 3️⃣ Run using Maven

```
mvn spring-boot:run
```

---

### 4️⃣ Or run from IntelliJ

Run the main class:

```
EazyBankApplication.java
```

---

# 🎯 Learning Objectives

This project helps understand:

* Spring Security architecture
* Authentication flow
* Security filter chain
* AuthenticationManager & AuthenticationProvider
* UserDetailsService
* Password encoding

---

# 📈 Future Improvements

Possible enhancements:

* JWT authentication
* Role-based authorization
* Database user authentication
* Custom login API
* Exception handling for security

---

# 👨‍💻 Author

Built for learning and practicing **Spring Security concepts** and backend security fundamentals in Spring Boot.

---

⭐ If you found this project helpful, consider giving it a **star on GitHub**.
