
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Enroll Course");
            System.out.println("3. Record Grade");
            System.out.println("4. View Student Info");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    manager.addStudent(name);
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Enter course name: ");
                    String courseName = scanner.next();
                    manager.enrollCourse(studentId, courseName);
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter course name: ");
                    String course = scanner.next();
                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();
                    manager.recordGrade(id, course, grade);
                    break;
                case 4:
                    System.out.print("Enter student ID: ");
                    int studentInfoId = scanner.nextInt();
                    manager.viewStudentInfo(studentInfoId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        
        scanner.close();
    }
}
