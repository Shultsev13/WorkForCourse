/**
 * Created by Hunter on 25.02.2018.
 */
public class Student
{
    private String name;
    private String surname;
    private int studentID;
    private double studentQuality;
    private boolean present = true;


    public Student(String name, String surname, int studentID)
    {
        this.name = name;
        this.surname = surname;
        this.studentID = studentID;
        this.studentQuality = (100.0 * Math.random());
        this.present = this.studentQuality >= 60;
    }

    private int getStudentID()
    {
        return studentID;
    }

    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    private String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public double getStudentQuality()
    {
        return studentQuality;
    }

    public boolean isPresent()
    {
        return present;
    }

    public void setPresent(boolean present)
    {
        this.present = present;
    }

    @Override
    public String toString()
    {
        return this.getStudentID() + ". " + this.getName() + " " + this.getSurname() + ". Is Present: " + this.isPresent();
    }


}
