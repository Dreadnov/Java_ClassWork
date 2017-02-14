import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Matthew on 2/13/2017.
 */
public class Sales
{
    static double total = 0;
    static double userInput;
    static int day = 0;

    public double getTotal()
    {
        return total;
    }
    public void setTotal(double total)
    {
        this.total = total;
    }

    public double getUserInput()
    {
        return userInput;
    }
    public void setUserInput(double userInput)
    {
        this.userInput = userInput;
    }

    public int getDay()
    {
        return day;
    }
    public void setDay(int day)
    {
        this.day = day;
    }

    public static void Write()// opens notepad.exe and then writes the outcome into the
    {
        try{
            PrintWriter outputFile = new PrintWriter("C:\\Users\\Matthew\\Downloads\\WeeklySales.txt");// goes to the file directory and prints

            for (int i = 1; i <= day; i++)// gets the distance by calculating speed times time
            {
                outputFile.println("Day" + day + ": $" + total );
            }
            ProcessBuilder pb = new ProcessBuilder("notepad.exe", "C:\\Users\\Matthew\\Downloads\\WeeklySales.txt");
            pb.start();
            outputFile.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}

