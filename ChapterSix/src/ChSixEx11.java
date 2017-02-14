import java.util.Scanner;
/**
 * Created by Matthew on 2/9/2017.
 */
public class ChSixEx11
{
    Scanner reader = new Scanner(System.in);//enables the scanner object
    private static double pi = Math.PI;//filed for pi and holds the math.pi

    private static double cal;//field for calculation
    private static double radios ;//field for radius
    private static double length,width ;//filed for length and width
    private static double base,height ;//field for base and height
    private int userChoice;//field for users choice


    //getters and setters for the respected fields
    public int getUserChoice()
    {
        return userChoice;
    }
    public void setUserChoice(int userChoice)
    {
        this.userChoice = userChoice;
    }

    public static double getRadios()
    {
        return radios;
    }
    public static void setRadios(double radios)
    {
        ChSixEx11.radios = radios;
    }

    public static double getLength()
    {
        return length;
    }
    public static void setLength(double length)
    {
        ChSixEx11.length = length;
    }

    public static double getWidth()
    {
        return width;
    }
    public static void setWidth(double width)
    {
        ChSixEx11.width = width;
    }

    public static double getBase()
    {
        return base;
    }
    public static void setBase(double base)
    {
        ChSixEx11.base = base;
    }

    public static double getHeight()
    {
        return height;
    }
    public static void setHeight(double height)
    {
        ChSixEx11.height = height;
    }

    private void validation()//a method that will trigger in the switch statement and will tell the user if the input is incorrect or not
    {
        while (radios < 0)//for the circle
        {
            System.out.print("Enter in the a positive number for radios: ");
            radios = reader.nextDouble();
        }
        while (height < 0 || width < 0)// for the rectangle
        {
            System.out.print("Enter in the a positive number for length: ");
            length = reader.nextDouble();
            System.out.print("Enter in the a positive number for width: ");
            width = reader.nextDouble();
        }
        while (base < 0 || height < 0)//for the triangle
        {
            System.out.print("Enter in a positive number for the base:  ");
            base = reader.nextDouble();
            System.out.print("Enter in a positive number for the height:  ");
            height = reader.nextDouble();
        }
    }
    public void choiceInput()//holds the switch statement that will trigger the use of the
    {
        switch (getUserChoice())
        {
            case 1 :// if the user is looking for the area of a circle
                System.out.print("Enter in the Radios of the Circle: " );// asks for the users input
                setRadios(reader.nextDouble());//grabs user input
                validation();//triggers my validation method
                circle();//taggers the calculation method
                System.out.print("Area: " + String.format("%,.2f", cal) );//displays final calculation
                break;
            case 2 :// if the user is looking for the area of a rectangle
                System.out.print("Enter in the length of the Rectangle: " );// asks for the users input
                setLength(reader.nextDouble());//grabs user input
                System.out.print("Enter in the Width of the Rectangle: ");// asks for the users input
                setWidth(reader.nextDouble());//grabs user input
                validation();//triggers my validation method
                rectangle();//taggers the calculation method
                System.out.print("Area: " + String.format("%,.2f", cal) );//displays final calculation
                break;
            case 3 :// if the user is looking for the area of a triangle
                System.out.print("Enter in the Base of the Triangle: " );// asks for the users input
                setBase(reader.nextDouble());//grabs user input
                System.out.print("Enter in the height of the Triangle: " );// asks for the users input
                setHeight(reader.nextDouble());//grabs user input
                validation();//triggers my validation method
                triangle();//taggers the calculation method
                System.out.print("Area: " + String.format("%,.2f", cal));//displays final calculation
                break;
            case 4 ://will end the program early
                System.out.print("Thank you, Good Bye");
                System.exit(1);//an exit parameter
                break;
        }
    }
    private static double circle()//calculation for the circle
    {
        cal = pi * (getRadios() * getRadios());

        return cal;
    }
    private static double rectangle()//calculation for the rectangle
    {
        cal = getLength() * getWidth();
        return cal;
    }
    private static double triangle()//calculation for the triangle
    {
        cal = getBase() * getHeight() * 0.5;
        return cal;
    }
}
