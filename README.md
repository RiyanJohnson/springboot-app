# Course API App

A simple REST API built using Spring Boot for managing topics and their corresponding courses.

This project demonstrates:
- RESTful API development
- CRUD operations
- layered backend architecture
- entity relationships
- Spring Boot fundamentals

---

## Features

### Topics Management
- Create topics
- Retrieve all topics
- Retrieve a specific topic
- Update topics
- Delete topics

### Courses Management
- Create courses under topics
- Retrieve all courses for a topic
- Retrieve individual courses
- Update course details
- Delete courses

---

## Tech Stack

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Maven

---

## Project Structure

```text
src/main/java/com/example/spring_app

├── CourseApi
│   ├── Topic.java
│   ├── TopicController.java
│   ├── TopicRepository.java
│   ├── TopicService.java
│
├── Courses
│   ├── Course.java
│   ├── CourseController.java
│   ├── CourseRepository.java
│   ├── CourseService.java
│
└── SpringAppApplication.java
```


## Running the Application

Clone the repository:

```bash
git clone <your-repository-url>
```

Run the application:

```bash
./mvnw spring-boot:run
```

or:

```bash
mvn spring-boot:run
```

---

## Learning Goal

This project was built to practice:
- Spring Boot fundamentals
- backend architecture
- REST API development
- Java backend engineering concepts
