# Spring Boot User Management Demo  

## 📌 Overview  
A simple Spring Boot application demonstrating:  
- **MVC Layered Architecture** (Model-View-Controller)  
- **Dependency Injection** (with `@Autowired`)  
- **In-Memory Database** (via `FakeRepo`)  
- **Unit Testing** (JUnit 5 + Mockito)  

---

## 🌟 GitHub About Section  
**Description**:  
`A Spring Boot demo showcasing MVC architecture, dependency injection, and unit testing with an in-memory user repository.`  

**Topics**:  
`java`, `spring-boot`, `dependency-injection`, `junit`, `mockito`, `gradle`  

---

## 🚀 Features  
- Add, retrieve, and delete users  
- Layered structure:  
  - **Model**: `User` class  
  - **Repository**: `FakeRepo` (in-memory storage)  
  - **Service**: `UserServiceImpl` (business logic)  
  - **Controller**: REST API endpoints (optional)  

---

## 🛠️ Technologies  
- Java 17  
- Spring Boot 3.x  
- Gradle  
- JUnit 5  
- Mockito  

---

## ⚡ Quick Start  
1. **Clone the repo**:  
   ```bash
   git clone https://github.com/Maduguma26/Spring-boot-user.git
   cd Spring-boot-user
Run the app:
./gradlew bootRun


Test:
./gradlew test


📂 Project Structure
src/
├── main/
│   ├── java/com/example/demo/
│   │   ├── model/User.java             # Data model
│   │   ├── repository/FakeRepo.java    # In-memory "database"
│   │   ├── service/UserServiceImpl.java # Business logic
│   │   └── controller/UserController.java (optional)
├── test/                              # Unit tests
│   └── java/com/example/demo/service/UserServiceTests.java


