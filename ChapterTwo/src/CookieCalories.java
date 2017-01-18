import java.util.Scanner;

/**
 * Created by Matthew on 1/11/2017.
 */
public class CookieCalories
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        int  servings;
        double  calories , cal ,userInput ;

        servings = 10;
        calories = 300;

        System.out.println("Enter in the amount of cookies that you have eaten: ");
        userInput = reader.nextInt();

        cal = (userInput/servings)*calories;
        System.out.println("Total Calories: " + cal);

    }
}
