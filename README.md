# Roll Number Decoder

> A full-stack application that decodes structured college roll numbers and extracts meaningful academic information such as admission year, college, branch, and other encoded details.

[![Java](https://img.shields.io/badge/Java-17%2B-orange)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Backend-brightgreen)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-Build-red)](https://maven.apache.org/)
[![MySQL](https://img.shields.io/badge/MySQL-Database-blue)](https://www.mysql.com/)
[![License](https://img.shields.io/badge/License-Educational-lightgrey)](#license)

---

## 📌 About the Project

**Roll Number Decoder** is a software project designed to decode structured college roll numbers and extract information encoded within them.

Many universities and colleges use a specific format for generating student roll numbers. Different sections of a roll number may represent information such as:

* Admission / academic year
* College or institution code
* Branch / course code
* Student identification or sequence information

This project takes a roll number as input, analyzes its structure, extracts the encoded components, and presents the corresponding information in an easy-to-understand format.

### Example

Consider the roll number:

```text
24029201000075
```

Depending on the defined institutional format, the number can be interpreted as:

```text
24      → Academic Year
0292    → College Code
010     → Branch Code
000075  → Student / Sequence Information
```

The application converts these encoded values into meaningful information.

---

# 🎯 Project Objective

The main objective of this project is to build a practical application that demonstrates how a structured identifier can be parsed, validated, decoded, and presented through a modern web application.

The project is also being developed as a learning journey from **Core Java to Full-Stack Java Development**.

The project evolution is:

```text
Core Java
    ↓
Object-Oriented Programming
    ↓
File / Data Processing
    ↓
Git & GitHub
    ↓
Maven
    ↓
Spring Boot
    ↓
REST API
    ↓
Database
    ↓
Frontend
    ↓
Full-Stack Application
```

---

# 🚀 Current Status

The project is currently being migrated from the original **Core Java implementation** to a modern **Spring Boot + database + frontend architecture**.

### Current development stages

* ✅ Core Java implementation
* ✅ Git repository created
* ✅ GitHub repository configured
* ✅ Version `v1.0.0` created for the Core Java implementation
* ✅ Repository restructured for full-stack development
* 🔄 Spring Boot backend development
* ⏳ REST API development
* ⏳ Database integration
* ⏳ Frontend development
* ⏳ Frontend and backend integration
* ⏳ Testing
* ⏳ Deployment

---

# 🏷️ Version History

| Version  | Stage       | Description                                 |
| -------- | ----------- | ------------------------------------------- |
| `v1.0.0` | Core Java   | Initial roll number decoding implementation |
| `v2.0.0` | Spring Boot | Planned backend and REST API                |
| `v3.0.0` | Full Stack  | Planned complete web application            |

The project uses Git commits for development history and Git tags for important releases and milestones.

---

# 🧠 How the Application Works

The basic concept is:

```text
User enters Roll Number
          ↓
Frontend receives input
          ↓
HTTP Request
          ↓
Spring Boot REST API
          ↓
Validate Roll Number
          ↓
Decode Roll Number
          ↓
Extract Year / College / Branch
          ↓
Find corresponding information
          ↓
Return JSON Response
          ↓
Frontend displays result
```

---

# 🔢 Roll Number Decoding

The application is based on a predefined roll number structure.

For example:

```text
24029201000075
```

Conceptually:

```text
┌────┬──────┬─────┬────────────┐
│ 24 │ 0292 │ 010 │   000075  │
└────┴──────┴─────┴────────────┘
  │      │      │        │
  │      │      │        └── Student / Sequence
  │      │      └─────────── Branch Code
  │      └────────────────── College Code
  └───────────────────────── Academic Year
```

> **Important:** The exact positions and meanings depend on the roll-number format defined by the target institution. The decoder will validate the expected format before extracting information.

---

# 💻 Technology Stack

## Backend

The backend is being developed using:

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Maven
* REST API
* Jakarta Validation
* JUnit
* Mockito

## Database

Planned database technologies:

* MySQL
* SQL
* JPA / Hibernate

## Frontend

The frontend is planned using:

* HTML5
* CSS3
* JavaScript
* REST API integration

A modern frontend framework such as React may be introduced in a future version.

## Development Tools

* Eclipse IDE
* Visual Studio Code
* Git
* GitHub
* Maven
* MySQL
* Postman

---

# 🏗️ Project Architecture

The final application is planned to follow a layered full-stack architecture.

```text
                         USER
                           │
                           ▼
                    ┌─────────────┐
                    │  Frontend   │
                    │ HTML/CSS/JS │
                    └──────┬──────┘
                           │
                           │ HTTP / REST
                           ▼
                    ┌─────────────┐
                    │ Controller  │
                    │ Spring Boot │
                    └──────┬──────┘
                           │
                           ▼
                    ┌─────────────┐
                    │   Service   │
                    │ Business    │
                    │   Logic     │
                    └──────┬──────┘
                           │
                           ▼
                    ┌─────────────┐
                    │ Repository  │
                    │ Spring Data │
                    └──────┬──────┘
                           │
                           ▼
                    ┌─────────────┐
                    │   MySQL     │
                    │  Database   │
                    └─────────────┘
```

---

# 📁 Repository Structure

The repository is organized to separate the original Core Java implementation from the new full-stack application.

```text
roll-number-decoder/
│
├── backend/
│   │
│   ├── pom.xml
│   │
│   └── src/
│       ├── main/
│       │   ├── java/
│       │   │   └── com/
│       │   │       └── hariom/
│       │   │           └── rolldecoder/
│       │   │               ├── controller/
│       │   │               ├── service/
│       │   │               ├── repository/
│       │   │               ├── model/
│       │   │               ├── exception/
│       │   │               └── RollNumberDecoderApplication.java
│       │   │
│       │   └── resources/
│       │       ├── application.properties
│       │       └── ...
│       │
│       └── test/
│           └── java/
│
├── frontend/
│   ├── index.html
│   ├── css/
│   ├── js/
│   └── ...
│
├── legacy/
│   └── core-java/
│       └── src/
│           └── in/
│               └── ac/
│                   └── mitmeerut/
│                       ├── analytics/
│                       ├── main/
│                       └── student/
│
├── README.md
└── .gitignore
```

---

# 🕰️ Legacy Core Java Implementation

The first version of the application was developed using **Core Java**.

The original implementation contains the initial decoding logic and demonstrates concepts such as:

* Java classes and objects
* Packages
* Object-Oriented Programming
* String processing
* Input/output
* Data processing
* Basic application structure

The original implementation is preserved under:

```text
legacy/core-java/
```

This implementation represents:

```text
v1.0.0
Core Java Version
```

The legacy implementation is preserved for:

* Historical reference
* Understanding the original algorithm
* Comparing the old and new architecture
* Demonstrating project evolution
* Learning purposes

The Spring Boot application does **not** need to directly reuse the old project structure. The useful business logic will be redesigned and implemented using a layered architecture.

---

# 🔄 Migration Strategy

The project is intentionally being developed incrementally.

## Phase 1 — Core Java

```text
Roll Number
     ↓
Java Program
     ↓
Decode
     ↓
Display Information
```

Status:

**Completed**

---

## Phase 2 — Project Restructuring

The repository is separated into:

```text
legacy/
backend/
frontend/
```

Status:

**Completed**

---

## Phase 3 — Spring Boot Backend

The Core Java decoding concept will be redesigned as a Spring Boot application.

Planned architecture:

```text
Controller
    ↓
Service
    ↓
Decoder / Business Logic
    ↓
Repository
    ↓
Database
```

Status:

**In Progress**

---

## Phase 4 — REST API

The backend will expose REST endpoints.

Example:

```http
GET /api/roll/{rollNumber}
```

Example request:

```http
GET /api/roll/24029201000075
```

Example response:

```json
{
  "rollNumber": "24029201000075",
  "year": 2024,
  "collegeCode": "0292",
  "collegeName": "College Name",
  "branchCode": "010",
  "branchName": "Computer Science"
}
```

Status:

**Planned**

---

## Phase 5 — Database

The application will store mapping information such as:

```text
College Code → College Name
Branch Code  → Branch Name
```

Example:

```text
College
----------------------------
code
name
location

Branch
----------------------------
code
name
department
```

Status:

**Planned**

---

## Phase 6 — Frontend

A web interface will allow users to enter their roll number.

Example:

```text
┌──────────────────────────────────────┐
│          ROLL NUMBER DECODER          │
│                                      │
│  Enter your roll number:             │
│                                      │
│  ┌──────────────────────────────┐    │
│  │ 24029201000075                │    │
│  └──────────────────────────────┘    │
│                                      │
│             [ DECODE ]               │
│                                      │
├──────────────────────────────────────┤
│                                      │
│  Year:       2024                    │
│  College:    College Name            │
│  Branch:     Computer Science        │
│  Roll No:    24029201000075          │
│                                      │
└──────────────────────────────────────┘
```

Status:

**Planned**

---

# 🔗 Frontend and Backend Communication

The frontend and backend are separate application layers.

They communicate through HTTP/REST APIs.

```text
Frontend
   │
   │ HTTP Request
   ▼
Spring Boot REST API
   │
   │ Business Logic
   ▼
Database
   │
   ▼
JSON Response
   │
   ▼
Frontend
```

Example:

```text
Frontend
   ↓
GET /api/roll/24029201000075
   ↓
Spring Boot
   ↓
Decode + Database Lookup
   ↓
JSON
   ↓
Frontend
```

---

# 🧪 Testing Strategy

Testing will be introduced throughout the development lifecycle.

## Unit Testing

Planned tools:

* JUnit
* Mockito

Example test cases:

```text
Valid roll number
Invalid roll number
Incorrect length
Invalid college code
Invalid branch code
Null input
Empty input
Special characters
```

## API Testing

Postman will be used during backend development.

Example:

```text
GET /api/roll/24029201000075
```

Expected result:

```text
HTTP 200 OK
```

Invalid input should return an appropriate error response.

---

# ⚠️ Validation and Error Handling

The application will validate user input before processing.

Examples:

```text
Empty roll number
        ↓
400 Bad Request
```

```text
Invalid roll number format
        ↓
400 Bad Request
```

```text
Valid format but unknown college code
        ↓
Appropriate application error
```

The backend will use proper exception handling rather than allowing application errors to reach the user as raw Java exceptions.

---

# 🔐 Security Considerations

Future versions may include:

* Input validation
* API rate limiting
* Authentication if required
* Authorization for administrative features
* Environment variables for secrets
* Secure database credentials
* Protection against SQL injection through JPA/repository usage
* Proper error responses without exposing internal application details

Sensitive configuration should never be committed to GitHub.

---

# ⚙️ Local Development

## Requirements

Before running the complete application, install:

* JDK 17 or newer
* Maven
* Git
* MySQL
* Eclipse IDE or another Java IDE
* Postman (recommended)

Frontend development may additionally require:

* Node.js
* npm

depending on the selected frontend technology.

---

# 🚀 Running the Backend

After the Spring Boot backend is implemented:

```bash
cd backend
```

Run using Maven:

```bash
./mvnw spring-boot:run
```

Or, if Maven is installed globally:

```bash
mvn spring-boot:run
```

The backend will normally run on:

```text
http://localhost:8080
```

---

# 🌐 Running the Frontend

The frontend will be started separately depending on the selected frontend technology.

For a basic HTML/CSS/JavaScript implementation, it can be served using a local development server.

For a future React implementation:

```bash
cd frontend
npm install
npm run dev
```

---

# 🔧 Git and Version Control

This project uses **Git** for version control and **GitHub** for remote repository hosting.

### Basic workflow

```text
Make changes
     ↓
git status
     ↓
git add
     ↓
git commit
     ↓
git push
     ↓
GitHub
```

Example:

```bash
git status
git add .
git commit -m "Add roll number decoding service"
git push origin main
```

---

# 🏷️ Versioning

Important project milestones are represented using Git tags.

Current release:

```text
v1.0.0
```

### Version meaning

```text
MAJOR.MINOR.PATCH
```

Example:

```text
v1.0.0
```

* **MAJOR** — major architecture or breaking change
* **MINOR** — new functionality
* **PATCH** — bug fixes and small improvements

Planned milestones:

```text
v1.0.0 → Core Java
v2.0.0 → Spring Boot Backend
v3.0.0 → Full-Stack Application
```

---

# 🌿 Branching Strategy

For larger features, development branches may be used.

Example:

```text
main
 │
 ├── feature/spring-boot-backend
 ├── feature/roll-number-api
 ├── feature/database
 └── feature/frontend
```

A feature can be developed separately and merged into `main` after testing.

---

# 📊 Future Features

Potential future improvements include:

* [ ] Roll number validation
* [ ] Multiple roll-number formats
* [ ] College database
* [ ] Branch database
* [ ] Student information lookup
* [ ] REST API
* [ ] Web interface
* [ ] Search history
* [ ] Admin dashboard
* [ ] College/branch management
* [ ] API documentation using Swagger/OpenAPI
* [ ] Unit and integration testing
* [ ] Docker support
* [ ] Cloud deployment
* [ ] Responsive mobile UI
* [ ] Authentication and authorization
* [ ] React frontend
* [ ] Production monitoring

---

# 📚 Learning Objectives

This project is also being used to practice and demonstrate:

### Core Java

* OOP
* Classes and Objects
* Encapsulation
* Inheritance
* Abstraction
* Polymorphism
* Collections
* Exception Handling
* File I/O
* String processing
* Java 8+ features
* Lambda Expressions
* Stream API
* Optional
* Multithreading
* Annotations
* Records
* Sealed Classes

### Backend Development

* Spring Boot
* REST APIs
* Dependency Injection
* Spring MVC
* Spring Data JPA
* Hibernate
* Exception Handling
* Validation
* Database Integration
* Unit Testing

### Software Engineering

* Git
* GitHub
* Version Control
* Branching
* Commits
* Tags
* Semantic Versioning
* Maven
* Project Architecture
* API Design
* Testing
* Documentation

---

# 🗂️ Development Philosophy

The project follows a gradual migration strategy.

The original Core Java application is not treated as wasted code. It represents the first implementation of the idea.

The project is being evolved from:

```text
Simple Java Program
       ↓
Structured Java Application
       ↓
Backend Service
       ↓
REST API
       ↓
Database-backed Application
       ↓
Full-Stack Web Application
```

The goal is to understand not only how to write Java code, but also how a real software project evolves from an initial prototype into a maintainable application.

---

# 🤝 Contributing

This project is currently maintained as a personal learning and development project.

Suggestions, improvements, and technical discussions are welcome.

If you want to contribute:

```bash
git clone https://github.com/hariomkumarcse/roll-number-decoder.git
cd roll-number-decoder
```

Create a feature branch:

```bash
git switch -c feature/your-feature-name
```

Make your changes, test them, commit them, and create a pull request.

---

# 📄 License

This project is intended primarily for educational and development purposes.

A formal open-source license may be added in a future release.

---

# 👨‍💻 Author

## Hariom Kumar

Computer Science Engineering Student
Java | Spring Boot | SQL | Git | Full-Stack Development

GitHub:

https://github.com/hariomkumarcse

---

# ⭐ Project Status

**Roll Number Decoder is actively under development.**

The current objective is to transform the original Core Java implementation into a production-style full-stack application using:

```text
Java
   +
Spring Boot
   +
REST API
   +
MySQL
   +
HTML/CSS/JavaScript
   +
Git/GitHub
```

---

## Project Repository

**GitHub:**
https://github.com/hariomkumarcse/roll-number-decoder

---

> Built as a practical journey from Core Java to Full-Stack Java Development.
