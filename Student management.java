
import java.util.HashMap;

public class StudentManager {
    private HashMap<Integer, Student> students;
    private int nextId;

    public StudentManager() {
        students = new HashMap<>();
        nextId = 1;
    }

    public void addStudent(String name) {
        Student student = new Student(nextId++, name);
        students.put(student.getId(), student);
        System.out.println("Added: " + name + " with ID: " + student.getId());
    }

    public void enrollCourse(int studentId, String course) {
        Student student = students.get(studentId);
        if (student != null) {
            student.enrollCourse(course);
            System.out.println("Enrolled " + student.getName() + " in " + course);
        } else {
            System.out.println("Student not found.");
        }
    }

    public void recordGrade(int studentId, String course, double grade) {
        Student student = students.get(studentId);
        if (student != null) {
            student.recordGrade(course, grade);
            System.out.println("Recorded grade for " + student.getName() + " in " + course);
        } else {
            System.out.println("Student not found.");
        }
    }

    public void viewStudentInfo(int studentId) {
        Student student = students.get(studentId);
        if (student != null) {
            student.displayInfo();
        } else {
            System.out.println("Student not found.");
        }
    }
}
