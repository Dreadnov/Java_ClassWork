import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by Matthew on 2/17/2017.
 */
public class ChSevenEx8_GradeBook_Launcher
{
    //static local variables
    static String input = "*";
    static Scanner reader = new Scanner(System.in);
    static String[] nameArr = new String[5];
    static char[] gradeArr = new char[5];
    static double[][] testArr = new double[5][4];
    static double sum = 0, ave = 0;
    //main method
    public static void main(String[] args)
    {
        //to evaluate the double array
        for (int i = 0; i < 5 ; i++)
        {
            nameArr[i] = queryName();
            for (int j = 0; j < 4; j++)
            {
               testArr[i][j] = queryTestScores(j);
                input = "*";
            }
        }
        //display the final outcome
        for (int i = 0; i < 5; i++)
        {
            calcAverage(i);
            calcGrade(i);
            System.out.println("Student: " + nameArr[i]);
            System.out.println("Letter Grade: " + gradeArr[i]);
            System.out.println("Ave:: " +String.format("%,.2f", ave));
            System.out.println("----------------------------");


        }
    }
    //asks the user their name and sets it to the next line
    private static String queryName()
    {
        System.out.println("\nEnter your name :");
        return  reader.nextLine();
    }
    //to validate the users input and get the users input and send it to the double array
    private static double queryTestScores(int index)
    {
        while(input.equals("*"))
        {
            System.out.println("Enter your score for test" + (index + 1) + " - ");
            input = reader.nextLine();//sets the next value to input
        }
        if (Double.parseDouble(input) < 0 || Double.parseDouble(input) > 100)
        {
            input = "*";
            System.out.print("Error: value is incorrect 1-100");
        }
        return Double.parseDouble(input);//returns the value of input


    }
    //calculates the avg of the test scores
    private static void calcAverage(int index)
    {
        sum = 0;
        for (int i = 0; i < 4 ; i++)
        {
            sum += testArr[index][i];
        }
        ave = sum / 4;
    }
    // sets the letter grade for the kids grade
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

