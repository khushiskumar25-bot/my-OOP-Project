public class Main {
    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student("Khushi", "101");
        Student s2 = new Student("Amit", "102");

        // Create Courses
        Course c1 = new Course("Data Structures");
        Course c2 = new Course("OOP Concepts");

        // Enroll Students
        s1.enroll(c1.getTitle());
        s2.enroll(c2.getTitle());

        c1.addStudent(s1);
        c2.addStudent(s2);

        // Display Information
        System.out.println(s1.showDetails());
        System.out.println(s2.showDetails());
        System.out.println(c1.showDetails());
        System.out.println(c2.showDetails());
    }
}
