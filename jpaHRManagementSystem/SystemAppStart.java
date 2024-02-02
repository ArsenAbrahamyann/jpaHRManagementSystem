package jpaHRManagementSystem;

import jpaHRManagementSystem.functionalities.DepartmentManagement;
import jpaHRManagementSystem.functionalities.EmployeeManagement;
import jpaHRManagementSystem.functionalities.ManagerialOversight;
import jpaHRManagementSystem.functionalities.ProjectManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SystemAppStart {
    private static Scanner sc = new Scanner(System.in);
    private static final int EXIT = 0;
    private static int choice = 0;
    public static void startApplication() {

        while (true) {
            printManu();
            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    EmployeeManagement.start();
                    break;
                case 2:
                    DepartmentManagement.start();
                    break;
                case 3:
                    ProjectManagement.start();
                    break;
                case 4:
                    ManagerialOversight.start();
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    System.exit(EXIT);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printManu() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n  HR Management System " +
                  "\n1. Employee Management: " +
                  "\n2. Department Management: " +
                  "\n3. Project Management: " +
                  "\n4. Managerial Oversight: " +
                  "\n5. Exit " +
                  "Enter your choice: ");
        System.out.println(sb);
    }
}

