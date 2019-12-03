package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    static Scanner sc = new Scanner(System.in);
    static int response = 0;
    public static final String[] MONTHS = {"January","February","March","April","May","June","July", "August", "September", "October", "November", "December" };
    public static Doctor doctorLogged;
    public static  Patient patientLogged;


    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Select a choice");
        response = 0;

        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    response = 0;
                    System.out.println("Doctor");
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0 );
    }

    private static void authUser (int userType){
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro", "alejandro@cruz.com"));
        doctors.add(new Doctor("Maria", "maria@cruz.com"));
        doctors.add(new Doctor("daniel", "daniel@cruz.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Sebastian", "sebastian@gmail.com"));
        patients.add(new Patient("Angie", "angie@gmail.com"));
        patients.add(new Patient("Karen", "karen@gmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("insert your email");
            String email = sc.nextLine();

            if (userType == 1) {
                for (Doctor d : doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            } else if (userType == 2){
                for (Patient p : patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }else { System.out.println("Nothing"); }
        } while (!emailCorrect);
    }

    static void showPatientMenu(){
        response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4 ; i++) {
                        System.out.println(i + ". " + MONTHS[i-1]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);


    }
}
