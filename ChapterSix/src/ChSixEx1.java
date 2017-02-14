import java.util.Scanner;

/**
 * Created by Matthew on 2/7/2017.
 */
public class ChSixEx1
{

    private static enum shape {CIRCLE,RECTANGEL,CYLINDER}// enables the enumeration
    private static Scanner reader = new Scanner(System.in);// enables the scanner object for this class
    private static int input = 0;
    public static int getInput()
    {
        return input;
    }//get the information that was already set by the user
    public static void setInput(int input)
    {
        ChSixEx1.input = input;
    }//set the users input

    public static void grabUserInput()// holds the switch switch that holds the options that will be used depending on the users input
    {
     switch (input)
     {
         case 0 ://for the area of a circle
             System.out.print("Enter in the radius of the circle: ");
             int radius = reader.nextInt();
             System.out.println("Area: " + String.format("%,.2f", area(radius)));
             break;
         case 1 ://for the area of a rectangle
             System.out.print("Enter in the height:");
             int width = reader.nextInt();
             System.out.print("Enter in the width:");
             int height = reader.nextInt();
             System.out.format("Area: " + String.format("%,.2f", area(width,height)));
             break;
         case 2 ://for the area of a cylinder
             System.out.print("Enter in the radius: ");
             double radious = reader.nextInt();
             System.out.format("Enter in height: ");
             int heigh = reader.nextInt();
             System.out.format("Area: " + String.format("%,.2f", area(radious,heigh)));
             break;
     }
    }
    private static double area( double radius)//calculation for the area of a circle
    {
        double pi = Math.PI;
        return pi * (radius * radius);
    }
    private static double area(int width, int height )//calculation for the area of a rectangle
    {
        return (double)width * height;
    }
    private static double area( double radius, int heigh)//calculates for the area of a cylinder
    {
        double pi = Math.PI;
        return pi * (radius * radius) * heigh;
    }
}
