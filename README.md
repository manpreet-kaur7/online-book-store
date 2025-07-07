# 📚 Online Book Store - Microservices Project

This is a microservices-based backend project built using **Java**, **Spring Boot**, and **MySQL**. It demonstrates core microservices concepts such as service registration/discovery, API gateway routing, RESTful communication, and modular architecture.


## 🧱 Microservices Architecture

- 🔍 **Eureka Server** – Service registry for discovering and managing services
- 🚪 **API Gateway** – Entry point for routing client requests to appropriate services
- 👤 **User Service** – Manages user data and registration
- 📖 **Book Service** – Handles CRUD operations for books
- 📦 **Order & Inventory Services** – To manage orders and book stock

---

## 🛠️ Tech Stack

- **Java 21**
- **Spring Boot 3**
- **Spring Cloud Netflix Eureka**
- **Spring Cloud Gateway**
- **Spring Data JPA**
- **MySQL**
- *(Future: Spring Security with JWT, Docker, Swagger)*

---

## 📂 Project Structure
```
online-book-store/
├── eureka-server/ # Service registry
├── api-gateway/ # Gateway for routing requests
├── user-service/ # User management
├── book-service/ # Book CRUD operations
└── README.md
