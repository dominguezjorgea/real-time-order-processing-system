# Real-Time Order Processing System 🛒

This project implements an **event-driven microservices system** using **Spring Boot, RabbitMQ, PostgreSQL, and Docker**.

## 📌 Microservices Overview

1️⃣ **Order Service** → Creates orders & publishes events.  
2️⃣ **Payment Service** → Listens for orders & processes payments.  
3️⃣ **Notification Service** → Sends notifications after payment is successful.

## 🚀 Getting Started

### 1️⃣ Install Dependencies

- Install **Docker & Docker Compose** → [Download](https://www.docker.com/get-started)
- Install **Java 21** → [Download](https://adoptium.net/)
- Install **Maven** → [Install Guide](https://maven.apache.org/install.html)

### 2️⃣ Start/stop the Services

```bash
bash scripts/start-services.sh
bash scripts/stop-services.sh
```
