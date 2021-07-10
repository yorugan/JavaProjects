package SchoolManagementSystem;

import java.util.ArrayList;

/**
 * Student class to keep the track of students grade, fees, identification, name
 * */


public class Student extends Employee {

    private int feesPaid;
    private int feesTotal;
    private String grade;
    private ArrayList<String> courses;
    private int gradeYear;


    public Student(int id, String firstName, String lastName, String gender) {
        super(id, firstName, lastName, gender);

    }

    // Sets student id
    // Gotta add validation

    public void setStudentId(int id) {
        setId(id + 1);
    }


}
