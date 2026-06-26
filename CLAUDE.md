# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Commands

```bash
# Start the database (required before running the app)
docker compose up -d

# Build
./mvnw clean package

# Run
./mvnw spring-boot:run

# Run tests
./mvnw test

# Run a single test class
./mvnw test -Dtest=AiNewsSummarizerApplicationTests

# Stop the database
docker compose down
```

## Architecture

Spring Boot 4.1.0 / Java 21 REST API that fetches and summarizes AI news, backed by MariaDB.

**Dependency stack**: Spring Boot + JPA/Hibernate + MariaDB + MapStruct (DTO mapping).

**Database**: MariaDB 11 running in Docker (`docker-compose.yml`). The `regnews` schema, user, and password are all `regnews`. phpMyAdmin is available at `http://localhost:8080`. JPA is set to `ddl-auto: update` so schema evolves automatically.

**Package layout**:
- `org.example.ainewssummarizer` -- application entry point, controller, service, repository, and MapStruct mapper
- `entities` -- JPA entity classes (e.g. `AppUser`)

**Known issues to resolve**:
- `AppUser.java` imports `javax.persistence.*` but Spring Boot 4.x requires `jakarta.persistence.*` -- this will fail to compile.
- `NewsMapper.java` references `Client`, `CreateClientDTO`, `ReturnClientDTO`, and `UpdateClientDTO` which do not yet exist; the mapper is a template/placeholder showing the intended CRUD mapping pattern (POST uses `toEntity`, GET uses `toDto`, PUT uses `updateEntity` with `@MappingTarget`).
- `Controller`, `Services`, and `Repository` are empty stubs.

**MapStruct pattern** (see `NewsMapper.java`): mappers are Spring-managed components (`componentModel = "spring"`), unmapped target fields are silently ignored (`ReportingPolicy.IGNORE`). For PUT operations, `@MappingTarget` mutates an existing entity in place rather than creating a new one.
