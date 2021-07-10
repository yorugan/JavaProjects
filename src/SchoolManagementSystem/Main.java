package SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {

        Student student = new Student( 0, "Ben", "Son", "M" );

        student.setStudentId(student.getId());
        System.out.println(student.getId());

        Student student1 = new Student( 1, "Bro", "Jack", "K");
        student1.setStudentId(student1.getId());
        System.out.println(student1.getId());




    }
}
