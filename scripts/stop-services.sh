#!/bin/bash

echo "Stopping all microservices..."
pkill -f 'mvn spring-boot:run'

echo "Stopping Docker containers..."
docker-compose down

echo "All services stopped!"
