# 🏥 Hospital Management System

A comprehensive console-based Hospital Management System built with Java, demonstrating core Object-Oriented Programming principles and efficient data management for healthcare operations.

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![OOP](https://img.shields.io/badge/OOP-Principles-blue?style=for-the-badge)](https://github.com/adarshrai03/Hospital-Management)

## 📋 Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [System Architecture](#system-architecture)
- [Installation & Setup](#installation--setup)
- [Usage & Demo](#usage--demo)
- [Key Concepts Demonstrated](#key-concepts-demonstrated)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)

## 🎯 Overview

The Hospital Management System is a Java-based console application designed to streamline hospital operations by managing patient records, doctor information, and appointment scheduling. This project showcases practical implementation of Object-Oriented Programming concepts including encapsulation, inheritance, and data abstraction.

### Problem Statement
Healthcare facilities need an efficient system to:
- Maintain patient and doctor records
- Schedule and track appointments
- Provide quick access to medical staff information
- Ensure organized healthcare service delivery

## ✨ Features

### Core Functionalities

🔹 **Patient Management**
- Add new patient records with auto-generated unique IDs
- Store patient information (Name, Age, Gender)
- View complete patient registry

🔹 **Doctor Management**
- Register doctors with specialization details
- Auto-incremented unique doctor IDs
- Display all available doctors and their specialties

🔹 **Appointment Scheduling**
- Book appointments between patients and doctors
- Date-based appointment tracking
- Validation for patient and doctor existence
- View all scheduled appointments

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| **Java** | Core programming language |
| **OOP Concepts** | Design pattern implementation |
| **ArrayList** | Dynamic data storage |
| **Scanner** | User input handling |
| **Package Management** | Code organization |

## 📁 Project Structure

```
Hospital-Management/
│
├── Management/
│   ├── Patient.java          # Patient entity class
│   ├── Doctor.java           # Doctor entity class
│   └── Appointment.java      # Appointment management class
│
└── Main.java                 # Application entry point & controller
```

### Class Descriptions

#### 🩺 `Patient.java`
Represents a patient entity with:
- Auto-incrementing ID system
- Personal information (name, gender, age)
- Getter methods and toString() for display

#### 👨‍⚕️ `Doctor.java`
Models a doctor with:
- Unique identification system
- Name and medical specialization
- Professional information retrieval methods

#### 📅 `Appointment.java`
Manages appointment bookings:
- Links patients with doctors
- Date tracking for appointments
- Formatted appointment details display

#### 🎮 `Main.java`
Application controller featuring:
- Menu-driven interface
- CRUD operations for patients and doctors
- Appointment scheduling logic
- Data validation and error handling

## 🏗️ System Architecture

```
┌─────────────────────────────────────────┐
│         Main Application Menu           │
└─────────────────┬───────────────────────┘
                  │
        ┌─────────┴─────────┐
        │                   │
    ┌───▼────┐         ┌────▼───┐
    │Patient │         │ Doctor │
    │Manager │         │Manager │
    └───┬────┘         └────┬───┘
        │                   │
        └─────────┬─────────┘
                  │
           ┌──────▼──────┐
           │ Appointment │
           │  Scheduler  │
           └─────────────┘
```

## 🚀 Installation & Setup

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or Command Line

### Steps to Run

1. **Clone the repository**
```bash
git clone https://github.com/adarshrai03/Hospital-Management.git
cd Hospital-Management
```

2. **Compile the Java files**
```bash
javac Management/*.java Main.java
```

3. **Run the application**
```bash
java Main
```

## 💻 Usage & Demo

### Interactive Menu
```
Hospital Management System
1. Add Patient
2. Add Doctor
3. Schedule Appointment
4. View Patient
5. View Doctor
6. View Appointment
Enter Your choice:
```

### Complete Workflow Demo

#### Step 1: Adding Doctors
```
Enter Your choice: 2
Enter name of Doctor : Dr.Sharma
Enter Speciality: Cardiology
Doctor added successfully

Enter Your choice: 2
Enter name of Doctor : Dr.Verma
Enter Speciality: Neurology
Doctor added successfully
```

#### Step 2: Adding Patients
```
Enter Your choice: 1
Enter Patient Name: Rahul
Enter Patient Age: 45
Enter Patient Gender: Male
Patient added successfully

Enter Your choice: 1
Enter Patient Name: Priya
Enter Patient Age: 32
Enter Patient Gender: Female
Patient added successfully
```

#### Step 3: View All Doctors
```
Enter Your choice: 5
List of Doctors :
Doctor Id: 1, Name : Dr.Sharma Speciality: Cardiology
Doctor Id: 2, Name : Dr.Verma Speciality: Neurology
```

#### Step 4: View All Patients
```
Enter Your choice: 4
List of Patients :
Patient Id : 1, Name: Rahul, Gender: Male, Age: 45
Patient Id : 2, Name: Priya, Gender: Female, Age: 32
```

#### Step 5: Schedule Appointments
```
Enter Your choice: 3
Enter Patient Id : 1
Enter Doctor Id : 1
Enter Appointment Date (DD-MM-YYYY) : 15-10-2024
Appointment Booked Successfully

Enter Your choice: 3
Enter Patient Id : 2
Enter Doctor Id : 2
Enter Appointment Date (DD-MM-YYYY) : 16-10-2024
Appointment Booked Successfully
```

#### Step 6: View All Appointments
```
Enter Your choice: 6
List of Appointments :
Appointment: [ Patient: Patient Id : 1, Name: Rahul, Gender: Male, Age: 45 ] [ Doctor : Doctor Id: 1, Name : Dr.Sharma Speciality: Cardiology, Date: 15-10-2024 ]
Appointment: [ Patient: Patient Id : 2, Name: Priya, Gender: Female, Age: 32 ] [ Doctor : Doctor Id: 2, Name : Dr.Verma Speciality: Neurology, Date: 16-10-2024 ]
```

#### Step 7: Error Handling Demo
```
Enter Your choice: 3
Enter Patient Id : 5
Enter Doctor Id : 1
Enter Appointment Date (DD-MM-YYYY) : 17-10-2024
Invalid Patient ID or Doctor ID !
```

#### Exit Application
```
Enter Your choice: 0
Exiting...
```

## 🎓 Key Concepts Demonstrated

### Object-Oriented Programming
- **Encapsulation**: Private fields with public getter methods
- **Abstraction**: Separate entity classes for different domain objects
- **Data Modeling**: Real-world entities represented as Java classes

### Data Structures
- **ArrayList**: Dynamic data storage for patients, doctors, and appointments
- **Collections Framework**: Efficient data management and retrieval

### Design Principles
- **Single Responsibility**: Each class has a specific purpose
- **Package Organization**: Logical separation of management entities
- **Code Reusability**: Helper methods for finding entities by ID

### Programming Best Practices
- Static ID counters for unique identification
- Input validation and error handling
- Clean, readable code with proper naming conventions
- Modular method design

## 🔮 Future Enhancements

- [ ] Database integration (MySQL/PostgreSQL) for persistent storage
- [ ] GUI implementation using JavaFX or Swing
- [ ] Appointment cancellation and rescheduling
- [ ] Doctor availability checking
- [ ] Patient medical history tracking
- [ ] Search and filter functionality
- [ ] Report generation (PDF/Excel)
- [ ] Multi-user authentication system
- [ ] Appointment reminder notifications

## 🤝 Contributing

Contributions are welcome! Feel free to:
- Fork the repository
- Create a feature branch
- Submit a pull request

## 📧 Contact

**Adarsh Rai**
- Email: arai41918@gmail.com
- LinkedIn: [Adarsh Rai](https://linkedin.com/in/adarsh-rai-a5714628a)
- GitHub: [@adarshrai03](https://github.com/adarshrai03)

---

<div align="center">

**If you found this project helpful, please consider giving it a ⭐!**

Made with ❤️ by Adarsh Rai

</div>
