# EazySchool - School Management System

A comprehensive school management system built with Spring Boot that helps educational institutions manage their administrative tasks, user roles, and communications efficiently.

## 🚀 Features

- **User Authentication & Authorization**
  - Secure login system with email and password
  - Custom password validation
  - Role-based access control
  - Field matching validation for email and password confirmation

- **User Management**
  - Student and staff registration
  - Profile management
  - Address management
  - Role assignment

- **Holiday Management**
  - View and manage school holidays
  - Holiday calendar integration

- **Contact Management**
  - Contact form processing
  - Query handling system

## 🛠️ Technology Stack

- **Backend**
  - Java 17
  - Spring Boot
  - Spring Security
  - Spring Data JPA
  - Hibernate
  - H2 Database (Development)

- **Frontend**
  - Thymeleaf
  - HTML/CSS
  - Bootstrap

## 📋 Prerequisites

- JDK 17 or later
- Maven 3.6 or later
- Your favorite IDE (Spring Tool Suite, IntelliJ IDEA, etc.)

## 🔧 Installation & Setup

1. Clone the repository
   ```bash
   git clone https://github.com/yourusername/EazySchool.git
   ```

2. Navigate to project directory
   ```bash
   cd EazySchool
   ```

3. Build the project
   ```bash
   mvn clean install
   ```

4. Run the application
   ```bash
   mvn spring-boot:run
   ```

The application will be available at `http://localhost:8080`

## 🏗️ Project Structure

```
src/main/java/com/helloworld/HelloWordProject/
├── annotation/
│   ├── FieldsValueMatch.java
│   └── PasswordValidator.java
├── audit/
│   └── AuditAwareImpl.java
├── controller/
│   ├── ContactController.java
│   ├── HolidayController.java
│   └── PublicController.java
├── model/
│   ├── Address.java
│   ├── BaseEntity.java
│   ├── Contact.java
│   ├── Holiday.java
│   ├── Person.java
│   └── Roles.java
├── repository/
│   ├── ContactRepository.java
│   ├── HolidayRepository.java
│   └── PersonRepository.java
├── security/
│   └── EazySchoolUsernamePwdAuthenticationProvider.java
└── validations/
    └── PasswordStrengthValidator.java
```

## 🔐 Security Features

- Custom authentication provider
- Password strength validation
- Field matching validation for sensitive data
- BCrypt password encoding
- Role-based access control
- Audit logging

## 📝 Database Schema

The application uses JPA entities with the following key relationships:
- Person -> Roles (OneToOne)
- Person -> Address (OneToOne)
- Audit fields (createdBy, createdAt, etc.) in BaseEntity

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- Spring Boot and Spring Security documentation
- Java community for continuous support
- All contributors who help to improve this project

## 📞 Contact

Developed By - Ruchit Nigam

Project Link: [https://github.com/Ruchitn21/EazySchool](https://github.com/Ruchitn21/EazySchool)
