import java.util.Scanner;
/**
 * Created by Matthew on 1/23/2017.
 */
public class ChThreeEx9Launcher
{
    public static void main(String[] args)
    {
        //gets the user input and displays the ending
        Scanner reader = new Scanner(System.in);
        ChThreeEx9 Circle = new ChThreeEx9();
        System.out.print("Enter in the radius of the circle:");
        Circle.setRadius(reader.nextDouble());
        System.out.printf("Current Area = %.2f\nCurrent Diameter = %.2f\nCurrent Circumference = %.2f",
                Circle.getArea(),Circle.getDiameter(),Circle.getCircumference());

        reader.close();
    }
}
