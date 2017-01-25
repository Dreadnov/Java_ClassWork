import java.util.Scanner;

/**
 * Created by Matthew on 1/24/2017.
 */
public class ChFourEx2Launcher
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        ChFourEx2 calc = new ChFourEx2();

        System.out.print("Enter in the amount of seconds: ");
        calc.setUserInput(reader.nextDouble());

        calc.calcInput();



    }
}
