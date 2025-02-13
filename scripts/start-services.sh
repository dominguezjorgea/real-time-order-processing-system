#!/bin/bash

echo "Starting PostgreSQL and RabbitMQ..."
docker-compose up -d

echo "Starting order-service..."
cd ../order-service && mvn spring-boot:run &

echo "Starting payment-service..."
cd ../payment-service && mvn spring-boot:run &

echo "Starting notification-service..."
cd ../notification-service && mvn spring-boot:run &

echo "All services started!"
