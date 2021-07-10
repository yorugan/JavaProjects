package SchoolManagementSystem;

import java.util.ArrayList;

public class School {

    private String schoolName;
    private ArrayList<Teacher> teacher = new ArrayList<>();
    private ArrayList<Student> student = new ArrayList<>();
    private ArrayList<Employee> employee;

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    // add Teacher
    public void addTeacher(Teacher teachers)
    {
        teacher.add(teachers);
    }

    // add Student
    public void addStudent(Student students)
    {
        student.add(students);
    }

    // add employee
    public void addEmployee(Employee employees)
    {
        employee.add(employees);
    }

    // remove teacher
    public void removeTeacher(Teacher teachers)
    {
        teacher.remove(teachers);
    }

    // remove student
    public void removeStudent(Student students)
    {
        student.remove(students);
    }

    // remove employee
    public void removeEmployee(Employee employees)
    {
        employee.remove(employees);
    }

    // enrol students to courses - have lists of students to take courses


    // teachers teach courses



}