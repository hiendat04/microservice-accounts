# microservice-accounts

Account service in my microservices system (work in progress).

## Overview
`microservice-accounts` is responsible for account-related capabilities (account profile, basic account data, and account lifecycle operations) within my microservices ecosystem.

This project is still being built, so APIs, configuration, and infrastructure will evolve over time.

## Current Status
- Active development (WIP)
- Documentation is intentionally minimal for now and will be expanded as the system stabilizes.

## Current Tech Stack (so far)
- Java

> I will update this section with the exact frameworks/tools once the service structure is finalized.

## Planned / Future Tech Stack (will be added progressively)
The long-term goal is to run these services as production-style microservices with:
- **Spring Boot** for building REST APIs
- **Spring Data JPA** (and a real database per service) for persistence
- **Centralized configuration** (config server / externalized configuration)
- **Service discovery + client-side load balancing** for service-to-service calls
- **API Gateway** for routing and cross-cutting concerns
- **Resilience patterns** (timeouts, retries, circuit breakers)
- **Observability stack** (metrics, logs, traces + dashboards)
- **Security** (OAuth2 / OpenID Connect style authentication & authorization)
- **Containerization** with Docker (+ Docker Compose for local dev)
- **Kubernetes** deployment (later) + **Helm** for packaging deployments
- Optional: **event-driven communication** for async workflows (message broker)

## How to Run
This will be updated with exact commands once the build and runtime approach is finalized.

Typical local workflow targets:
- Run service locally from IDE
- Run service + dependencies using Docker Compose
- Run the whole system via gateway

## API Docs
- Run the project and go to this link to open Swagger/ OpenAPI docs: http://localhost:8080/swagger-ui/index.html

## Project Approach / Plan
High-level plan for this service:
1. Implement core domain model + CRUD APIs
2. Add validation + consistent error handling
3. Add persistence + migrations
4. Integrate with other services through service discovery / gateway
5. Add resilience and observability
6. Add security and permissions model
7. Containerize and deploy (Compose → Kubernetes)

## Related Repositories
- `microservice-cards`
- `microservice-loans`

## Notes
This README is intentionally simple to avoid an empty repository. It will be updated as the system matures.
