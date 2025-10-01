import Management.Appointment;
import Management.Doctor;
import Management.Patient;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList <Patient> patientsList = new ArrayList<>();
    private static ArrayList <Doctor> doctorList = new ArrayList<>();
    private static ArrayList <Appointment> appointmentList = new ArrayList<>();

    private static void viewDoctor(){
        System.out.println("List of Doctors : ");
        for(Doctor doctor : doctorList){
            System.out.println(doctor);
        }
    }

    private static void viewPatient(){
        System.out.println("List of Patients : ");
        for (Patient patient : patientsList){
            System.out.println(patient);
        }
    }

    private static void viewAppointments(){
        System.out.println("List of Appointments : ");
        for(Appointment appointment : appointmentList){
            System.out.println(appointment);
        }
    }

    private static void addPatient(Scanner scanner){
        System.out.println("Enter Patient Name: ");
        String name = scanner.next();
        System.out.println("Enter Patient Age: ");
        int age = scanner.nextInt();
        System.out.println("Enter Patient Gender: ");
        String gender = scanner.next();

        Patient patient = new Patient(name , gender , age);
        patientsList.add(patient);
        System.out.println("Patient added successfully");
    }

    private static void addDoctor(Scanner scanner){
        System.out.println("Enter name of Doctor : ");
        String doctorName = scanner.next();
        System.out.println("Enter Speciality");
        String speciality = scanner.next();

        Doctor doctor = new Doctor(doctorName , speciality);
        doctorList.add(doctor);
        System.out.println("Doctor added successfully");
    }

    private static void scheduleAppointment(Scanner scanner){
        System.out.println("Enter Patient Id : ");
        int patientId = scanner.nextInt();
        System.out.println("Enter Doctor Id : ");
        int doctorId = scanner.nextInt();
        System.out.println("Enter Appointment Date (DD-MM-YYYY) : ");
        String date = scanner.next();

        Patient patient = findPatientById(patientId);
        Doctor doctor = findDoctorById(doctorId);

        if(patient != null && doctor != null){
            Appointment appointment = new Appointment(patient , doctor , date);
            appointmentList.add(appointment);
            System.out.println("Appointment Booked Successfully");
        }
        else System.out.println("Invalid Patient ID or Doctor ID !");
    }

    private static Patient findPatientById(int id){
        for(Patient patient : patientsList){
            if(patient.getId()==id) return patient;
        }
        return null;
    }

    private static Doctor findDoctorById(int id){
        for(Doctor doctor : doctorList){
            if(doctor.getId()==id) return doctor;
        }
        return null;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Hospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Patient");
            System.out.println("5. View Doctor");
            System.out.println("6. View Appointment");
            System.out.println("Enter Your choice: ");
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    addPatient(scanner);
                    break;
                case 2:
                    addDoctor(scanner);
                    break;
                case 3:
                    scheduleAppointment(scanner);
                    break;
                case 4:
                    viewPatient();
                    break;
                case 5:
                    viewDoctor();
                    break;
                case 6:
                    viewAppointments();
                    break;
                case 0 :
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while(choice!=0);
    }
}