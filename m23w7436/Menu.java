package twentyfour.fall.oop.group1.finalproject.m23w7436;

import java.util.Scanner;

public class Menu {
    private StudentManager studentManager;
    private FileHandler fileHandler;

    public Menu(StudentManager studentManager, FileHandler fileHandler) {
        this.studentManager = studentManager;
        this.fileHandler = fileHandler;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. View all students ");
            System.out.println("2. Add a new student");
            System.out.println("3. Search for a student");
            System.out.println("4. Delete a student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    studentManager.viewAllStudents();
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    String rollNumber = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();
                    studentManager.addStudent(new Student(name, rollNumber, grade));
                    break;
                case 3:
                    System.out.print("Enter roll number to search: ");
                    String searchRoll = scanner.nextLine();
                    studentManager.searchStudent(searchRoll);
                    break;
                case 4:
                    System.out.print("Enter roll number to delete: ");
                    String deleteRoll = scanner.nextLine();
                    studentManager.deleteStudent(deleteRoll);
                    break;
                case 5:
                    fileHandler.saveStudentsToFile(studentManager.getStudents());
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
