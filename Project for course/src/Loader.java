import java.util.Arrays;

/**
 * Created by Hunter on 25.02.2018.
 */
public class Loader
{
    public static void main(String[] args)
    {

        Professor professor1 = new Professor("Lol", "Kek", "Chebureck");
        Student student1 = new Student("qwe", "rty", 1);
        Student student2 = new Student("qw", "rt", 2);
        Group group = new Group("CS422");
        group.addMember(student1);
        group.addMember(student2);

//        System.out.println(group.getStudentList());
        System.out.println(group.getClassMonitor(group.getQuality()));

        System.out.println(professor1.doRollCall(group));
    }
}
