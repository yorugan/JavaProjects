package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Courses {

    private ArrayList<String> courses;

    // print courses

    public Iterator<String> printCourse(ArrayList<String> courses)
    {
        return courses.iterator();
    }

    // add courses, in case there might be a new course available
    // Validate course

    public void addCourse(String course)
    {
        courses.add(course);
    }


    // remove courses

    public void removeCourse(String course)
    {
        courses.remove(course);
    }


    //

}
