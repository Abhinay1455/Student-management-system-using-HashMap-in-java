
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private int id;
    private String name;
    private ArrayList<String> enrolledCourses;
    private HashMap<String, Double> grades;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(String course) {
        enrolledCourses.add(course);
    }

    public void recordGrade(String course, double grade) {
        grades.put(course, grade);
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Enrolled Courses: " + enrolledCourses);
        System.out.println("Grades: " + grades);
    }
}
