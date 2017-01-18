/**
 * Created by Matthew on 1/12/2017.
 */
import java.util.Scanner;
public class StringManipulator
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String city,cityUpper,cityLower,firstChar;
        int numOfChar;

        System.out.println("Enter in your favorite city: ");
        city = reader.next();
        firstChar = city.substring(0,1);
        numOfChar = city.length();
        cityUpper = city.toUpperCase();
        cityLower = city.toLowerCase();


        System.out.println("First Letter: " + firstChar );
        System.out.println("Number of Letters: " + numOfChar);
        System.out.println("All letters to Uppercase: " + cityUpper);
        System.out.println("All letters set to Lowercase: " + cityLower);





    }
}
