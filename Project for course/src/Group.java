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
        for (Student student : studentList)
        {
            if (max < student.getStudentQuality())
            {
                max = student.getStudentQuality();
            }
        }
        return max;
    }

    public String getGroupMonitor(double max)
    {
        String groupMonitor = "";
        for (Student student : studentList)
        {
            if (student.getStudentQuality() == max)
            {
                groupMonitor += student.getFullName();
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
        String list = "";
        for (Student student : studentList)
        {
            list += student.getAllInfo() + "\n";
        }
        return list;
    }
}
