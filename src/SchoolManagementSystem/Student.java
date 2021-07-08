package SchoolManagementSystem;

/**
 * Student class to keep the track of students grade, fees, identification, name
 * */


public class Student extends Person {

    private int feesPaid;
    private int feesTotal;
    private String grade;
    private String[] courses;
    private int gradeYear;


    public Student(int id, String firstName, String lastName, String gender) {
        super(id, firstName, lastName, gender);

    }

    public void setStudentId(int id) {
        setId(id + 1);
    }

    public void addCourse(String course) {

    }
}
