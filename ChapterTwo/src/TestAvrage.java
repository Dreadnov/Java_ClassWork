/**
 * Created by Matthew on 1/12/2017.
 */
import java.util.Scanner;


public class TestAvrage
{
    public static void main(String[] args)
    {

        Scanner reader = new Scanner(System.in);
        double input1, input2,input3,sum;

        //grabs the users input for the following fields
        System.out.println("Enter in the test score: ");
        input1 = reader.nextDouble();
        System.out.println("Enter in the test score: ");
        input2 = reader.nextDouble();
        System.out.println("Enter in the test score: ");
        input3 = reader.nextDouble();
        //calculates the sum
        sum = (input1 + input2 + input3)/3 ;

        //displays the outcome
        System.out.println("Average: " + sum);



    }
}
