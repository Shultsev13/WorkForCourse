import java.util.ArrayList;

/**
 * Created by Hunter on 25.02.2018.
 */
public class Group
{
    private ArrayList<Student> studentList = new ArrayList<>();
    private String name;
    private int groupCounter = 0;
    private final static int GROUP_SIZE = 30;
//    private Student[] studentList = new Student[GROUP_SIZE];

    public Group(String name)
    {
        this.name = name;
    }

    public double getQuality()
    {
        double max = 0;
        for (Student i : studentList)
        {
            if (max < i.getStudentQuality())
            {
                max = i.getStudentQuality();
            }
        }
        return max;
    }

    public String getClassMonitor(double max)
    {
        String classMonitor = "";
        for(Student i : studentList)
        {
            if(i.getStudentQuality() == max)
            {
                classMonitor += i;
                break;
            }
        }
        return classMonitor;
    }

    public void addMember(Student student)
    {
        if (groupCounter < GROUP_SIZE)
        {
            studentList.add(student);
            groupCounter++;
        }
        else
        {
            System.out.println("Group is full!");
        }
    }

    public String getStudentList()
    {
        String student = "";
        for(Student i : studentList)
        {
            student += i + "\n";
        }
        return student;
    }
}
