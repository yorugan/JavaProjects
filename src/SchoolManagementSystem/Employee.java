package SchoolManagementSystem;

import java.util.Locale;

public class Person {
    private String firstName;
    private String lastName;
    private int id;
    private String gender;

    public Person(int id, String firstName, String lastName, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGender(String gender)
    {
        if(gender.toLowerCase() == "male" || gender.toLowerCase() == "m")
        {
            this.gender = "Male";
        }else if(gender.toLowerCase() == "female" || gender.toLowerCase() == "f")
        {
            this.gender = gender;
        }else{
            this.gender = "I do not wish to self-identify";
        }
    }

    public String getGender()
    {
        return gender;
    }

}
