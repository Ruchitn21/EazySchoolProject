#!/bin/bash

# Kill any process running on port 8080
echo "Checking for processes running on port 8080..."
lsof -ti:8080 | xargs kill -9 2>/dev/null || echo "No process found on port 8080"

# Wait a moment to ensure the port is released
sleep 2

# Start the Spring Boot application
echo "Starting Spring Boot application..."
./mvnw spring-boot:run 