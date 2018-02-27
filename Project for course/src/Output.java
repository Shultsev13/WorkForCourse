import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Hunter on 27.02.2018.
 */
public class Output
{
    //private Output output = new Output();
    private Scanner scanner = new Scanner(System.in);
    private Student student = new Student();
    private Group group = new Group();
    private Professor professor = new Professor();
    private Pattern pattern = Pattern.compile("[0-9]+");
    private String[] arrTemp;

    public Output()
    {

    }

    public void enterGroupName()
    {
        System.out.println("Enter group name: ");
        group.setName(scanner.nextLine());
    }

    public void enterGroupSize()
    {
        System.out.println("Enter group size: ");
        String stringTemp = scanner.nextLine();
        Matcher matcher = pattern.matcher(String.valueOf(stringTemp));
        if (matcher.matches())
        {
            group.setGroupSize(Integer.parseInt(stringTemp));
        }
        else
        {
            error();
            enterGroupSize();
        }
    }

    public void enterStudentNames()
    {
        while (student.getStudentID() < group.getGroupSize())
        {
            System.out.println("Enter the name and surname of the " + (student.getStudentID() + 1) + " student:");
            arrTemp = scanner.nextLine().trim().split(" ");
            if (arrTemp.length < 2)
            {
                error();
            }
            else
            {
                group.addMember(new Student(arrTemp[0], arrTemp[1]));
            }
        }
    }

    public void enterProfessorsName()
    {
        System.out.println("Time to enter professors name: ");
        arrTemp = scanner.nextLine().trim().split(" ");
        if (arrTemp.length < 2)
        {
            error();
            enterProfessorsName();
        }
        else
        {
            professor.setName(arrTemp[0]);
            professor.setSurname(arrTemp[1]);
        }
    }

    public void mainMenu()
    {
        System.out
                .println("\n\nPress '1' to chose group monitor.\nPress '2' to do a roll call.\nPress '0' to exit.");
        int intTemp = scanner.nextInt();
        if (intTemp == 1)
        {
            System.out.println("Group: " + group.getName());
            System.out.println("The class monitor is: " + group.getClassMonitor(group.getMaxQuality()));
            mainMenu();
        }
        else if (intTemp == 2)
        {
            System.out.println("Professor: " + professor.getName() + " " + professor.getSurname());
            System.out.println("Group: " + group.getName());
            System.out.println(professor.doRollCall(group));
            mainMenu();
        }
        else if (intTemp == 0)
        {
            System.exit(0);
        }
        else
        {
            error();
            mainMenu();
        }
    }


    private void error()
    {
        System.out.println("Invalid input!");
    }
}
