import java.util.Scanner;

/**
 * Created by Matthew on 2/7/2017.
 */
public class ChSixEx1
{

    private static enum shape {CIRCLE,RECTANGEL,CYLINDER}
    private static Scanner reader = new Scanner(System.in);
    private static int input = 0;


    public static void grabUserInput()
    {
        System.out.print("Enter in 0: for circle 1: for rectangle 2: for cylinder ");
        input = reader.nextInt();
        if (input != 0 || input != 1 || input != 2)
        {
            System.out.print("Enter in a valid number : ");
            input = reader.nextInt();

        }
     switch (input)
     {
         case 0 :
             System.out.print("Enter in the radius of the circle: ");
             int radius = Integer.parseInt(reader.nextLine());
             System.out.println("Area: " + String.format("%,.2f", area(radius)));
             break;
         case 1 :
             System.out.format("Enter in the height:");
             int width = reader.nextInt();
             System.out.format("Enter in the width:");
             int height = reader.nextInt();
             System.out.format("Area: " + String.format("%,.2d", area(width,height)));
             break;
         case 2 :
             System.out.format()
             break;
     }
    }

    private static double area( double radius)
    {
        double pi = Math.PI;
        return pi * (radius * radius);
    }
    private static int area(int width, int height )
    {
        return width * height;
    }
    private static double area( double radius, int recrtangle)
    {
        double pi = Math.PI;
        return pi * (radius * radius);
    }
}
