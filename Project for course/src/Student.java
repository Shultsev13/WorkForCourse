/**
 * Created by Hunter on 25.02.2018.
 */
public class Student
{
    private String name;
    private String surname;
    private static int studentID = 0;
    private double studentQuality;
    private boolean present = true;


    public Student()
    {

    }
    public Student(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
        studentID++;
        studentQuality = (100.0 * Math.random());
        present = studentQuality >= 60;
    }

    public int getStudentID()
    {
        return studentID;
    }

    private String getName()
    {
        return name;
    }

    private String getSurname()
    {
        return surname;
    }

    public double getStudentQuality()
    {
        return studentQuality;
    }

    private boolean isPresent()
    {
        return present;
    }

    @Override
    public String toString()
    {
        return this.getStudentID() + ". " + this.getName() + " " + this.getSurname() + ". Is Present: " + this.isPresent();
    }


}
