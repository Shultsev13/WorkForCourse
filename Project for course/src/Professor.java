/**
 * Created by Hunter on 25.02.2018.
 */
public class Professor
{
    private String name;
    private String surname;

    public Professor()
    {

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String doRollCall(Group group)
    {
        return group.getStudentList();
    }
}
