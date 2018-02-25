/**
 * Created by Hunter on 25.02.2018.
 */
public class Professor
{
    private String name;
    private String surname;
    private String discipline;

    public Professor(String name, String surname, String discipline)
    {
        this.name = name;
        this.surname = surname;
        this.discipline = discipline;
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

    public String getDiscipline()
    {
        return discipline;
    }

    public void setDiscipline(String discipline)
    {
        this.discipline = discipline;
    }

    public String doRollCall(Group group)
    {
        return group.getStudentList();
    }
}
