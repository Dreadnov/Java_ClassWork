import java.util.Scanner;

/**
 * Created by Matthew on 2/17/2017.
 */
public class ChSevenEx9_GradeBookMod
{
    static String input = "*";
    static Scanner reader = new Scanner(System.in);
    static String[] nameArr = new String[5];
    static char[] gradeArr = new char[5];
    static double[][] testArr = new double[5][4];
    static double sum = 0, ave = 0;

    public static void main(String[] args)
    {
        for (int i = 0; i < 5 ; i++)
        {
            nameArr[i] = queryName();
            for (int j = 0; j < 4; j++)
            {
                testArr[i][j] = queryTestScores(j);
                input = "*";
            }
        }
        for (int i = 0; i < 5; i++)
        {
            calcAverage(i);
            calcGrade(i);
            System.out.println("Student: " + nameArr[i]);
            System.out.println("Letter Grade: " + gradeArr[i]);
            System.out.println("Ave:: " + String.format("%,.2f", ave));
            System.out.println("----------------------------");


        }
    }

    private static String queryName()
    {
        System.out.println("\nEnter your name :");
        return  reader.nextLine();
    }

    private static double queryTestScores(int index)
    {
        while(input.equals("*"))
        {
            System.out.println("Enter your score for test" + (index + 1) + " - ");
            input = reader.nextLine();
        }
        if (Double.parseDouble(input) < 0 || Double.parseDouble(input) > 100)
        {
            input = "*";
            System.out.print("Error: value is incorrect 1-100");
        }
        return Double.parseDouble(input);


    }
    private static void calcAverage(int index)
    {
        double low = 0;
        sum = 0;
        for (int i = 0; i < 4 ; i++)
        {
            if (testArr[index][i] < low || low == 0)
            {
                low = testArr[index][i];
            }
            sum += testArr[index][i];
        }
        sum -= low;
        ave = sum / 3;
    }

    private static void calcGrade(int index)
    {
        if (ave >= 90)
        {
            gradeArr[index] = 'A';
        }
        else if (ave >= 80)
        {
            gradeArr[index] = 'B';
        }
        else if (ave >= 70)
        {
            gradeArr[index] = 'C';
        }
        else if (ave >= 60)
        {
            gradeArr[index] = 'D';
        }
        else
        {
            gradeArr[index] = 'F';
        }

    }
}
