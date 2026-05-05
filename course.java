import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private List<Student> students;

    public Course(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String showDetails() {
        List<String> names = new ArrayList<>();
        for (Student s : students) {
            names.add(s.getName());
        }
        return "Course: " + title + " | Students: " + String.join(", ", names);
    }

    public String getTitle() {
        return title;
    }
}
