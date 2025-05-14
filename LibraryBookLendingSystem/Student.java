
public class Student extends User {

    public Student(String name, String userId, String studentId, String courseName, int yearOfStudy) {
        super(name, userId, false);
    }

    @Override
    public void showProfile() {
        System.out.println("Student Profile:\n");
        System.out.println("Name: " + name);
        System.out.println("User ID: " + userId);
    }
}

