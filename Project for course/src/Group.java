import java.util.ArrayList;

/**
 * Created by Hunter on 27.02.2018.
 */
public class Group
{
    private ArrayList<Student> studentList = new ArrayList<>();
    private String name;
    private int groupSize = 0;

    public Group()
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

    public int getGroupSize()
    {
        return groupSize;
    }

    public void setGroupSize(int groupSize)
    {
        this.groupSize = groupSize;
    }

    public double getMaxQuality()
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

    public String getGroupMonitor(double max)
    {
        String groupMonitor = "";
        for (Student i : studentList)
        {
            if (i.getStudentQuality() == max)
            {
                groupMonitor += i;
                break;
            }
        }
        return groupMonitor;
    }

    public void addMember(Student student)
    {
        studentList.add(student);
    }

    public String getStudentList()
    {
        String student = "";
        for (Student i : studentList)
        {
            student += i + "\n";
        }
        return student;
    }
}
