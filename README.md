# Simple CRUD Project

This repository contains a simple CRUD project built using **Java Spring Boot**.

It is intended as a **learning step** to understand how to manipulate variables through REST calls.

All the relevant code is currently inside the controller for **didactic purposes**.  
The goal is to learn how to use different REST components: **Path Variables, Query Parameters, Headers, and Request Body**, and how to filter a list using them.

---

## Getting Started

1. **Start the application with Maven**
2. The API will be accessible at: `http://localhost:8080`

---

## Database

The project uses **PostgreSQL** as the database.  
Database migrations are managed using **Flyway**.

### Setup

1. Create a PostgreSQL database named `product`.
2. Open the project in **IntelliJ IDEA**.
3. Configure the `application.properties` file with the proper **IP, port, username, password, and database name**.
4. Run a **clean build** (or `mvn clean install`).
5. Run the **main class** to start the application.

---

## Notes

- This project is **for learning purposes**, so business logic is simplified and mostly inside the controller.
- You can experiment with different **REST endpoints** and test filtering, sorting, and CRUD operations.
