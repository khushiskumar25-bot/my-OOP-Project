import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String rollNo;
    private List<String> courses;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.courses = new ArrayList<>();
    }

    public void enroll(String course) {
        courses.add(course);
    }

    public String showDetails() {
        return "Student: " + name + " (" + rollNo + ") | Courses: " + String.join(", ", courses);
    }

    public String getName() {
        return name;
    }
}
