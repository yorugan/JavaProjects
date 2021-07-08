package SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {

        Student student = new Student( 0, "Ben", "Son", "M" );
        System.out.println(student.getId());
        student.setId(3);
        System.out.println(student.getId());


    }
}
