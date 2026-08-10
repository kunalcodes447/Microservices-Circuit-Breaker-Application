Microservices-Circuit-Breaker-Application
Microservices Circuit Breaker – A Spring Boot microservices application demonstrating Circuit Breaker implementation using Resilience4j for handling service failures, preventing cascading failures, and providing fallback responses.

Microservices Circuit Breaker

A simple Spring Boot Microservices application demonstrating the implementation of a Circuit Breaker using Resilience4j to handle service failures and prevent cascading failures.

🚀 Technologies Java Spring Boot Spring Cloud Resilience4j REST API Maven

🔄 Circuit Breaker The application uses Resilience4j Circuit Breaker to:

Detect repeated service failures Open the circuit after reaching the configured failure threshold Prevent calls to the failing service Return a fallback response Automatically move toward recovery after the wait duration
