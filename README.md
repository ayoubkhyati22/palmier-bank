# PALMIER BANK - Banking Application

A Spring Boot REST API application for managing bank clients and accounts.

## Features

- Client Management (CRUD operations)
- Account Management (CRUD operations)
- H2 In-Memory Database
- Swagger UI for API Documentation
- Automatic sample data loading

## Technologies

- Java 17
- Spring Boot 3.2.1
- Spring Data JPA
- H2 Database
- Maven
- SpringDoc OpenAPI

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+

### Running the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

### Building the Project

```bash
mvn clean install
```

## API Endpoints

### Clients

- `POST /api/clients` - Create a new client
- `GET /api/clients` - Get all clients
- `GET /api/clients/{id}` - Get client by ID
- `PUT /api/clients/{id}` - Update client
- `DELETE /api/clients/{id}` - Delete client

### Accounts

- `POST /api/accounts?clientId={clientId}` - Create a new account
- `GET /api/accounts` - Get all accounts
- `GET /api/accounts/{id}` - Get account by ID
- `GET /api/accounts/client/{clientId}` - Get all accounts for a client
- `PUT /api/accounts/{id}` - Update account
- `DELETE /api/accounts/{id}` - Delete account

## Access Points

- **Swagger UI**: http://localhost:8080/swagger-ui.html
- **H2 Console**: http://localhost:8080/h2-console
  - JDBC URL: `jdbc:h2:mem:palmierdb`
  - Username: `sa`
  - Password: (empty)

## Sample Data

The application automatically loads sample data on startup:
- 3 clients (Jean Dupont, Marie Martin, Pierre Bernard)
- 6 accounts (2 per client)

## Project Structure

```
src/main/java/com/palmierbank/
├── PalmierBankApplication.java
├── config/
│   └── DataLoader.java
├── controller/
│   ├── AccountController.java
│   └── ClientController.java
├── entity/
│   ├── Account.java
│   └── Client.java
├── repository/
│   ├── AccountRepository.java
│   └── ClientRepository.java
└── service/
    ├── AccountService.java
    └── ClientService.java
```
