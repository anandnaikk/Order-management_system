# Order Management System

This is a Spring Boot-based backend system for managing product orders using Oracle DB, RabbitMQ, and multithreading.

## 🔧 Tech Stack
- Java
- Spring Boot
- Hibernate (JPA)
- RabbitMQ
- Oracle Database
- Multithreading (ExecutorService)

## 🚀 How to Run
1. Set up Oracle DB and update `application.properties`.
2. Ensure RabbitMQ is running locally.
3. Use `mvn spring-boot:run` to start the backend.

## 📁 Project Structure
- `controller/` - REST APIs
- `service/` - Business logic
- `config/` - RabbitMQ and security configuration
- `repository/` - JPA interfaces
- `entity/` - Hibernate models

## 🧪 API Testing
Use Postman or curl to test `/orders` endpoint for placing an order.

## 📬 Queue Flow
1. Orders placed via `/orders` API.
2. OrderRequest is published to RabbitMQ.
3. Consumer receives message and processes order in a background thread.
