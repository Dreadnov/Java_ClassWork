import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Matthew on 2/14/2017.
 */
    public class Examples
    {

        Scanner reader = new Scanner(System.in);
        /**
         * Enhanced for Loop
         */
            /*
            int[] numbers = {3,6,9};
            for (int val : numbers)
            {
                System.out.print("\nThe value is: " + val);
            }
            */

        /**
         * User specified array
         */
            /*
            System.out.print("Enter in the length of the array");
            int size = reader.nextInt();
            int[] num = new int [size];


            for (int i = 0; i < num.length; i++)
            {
                System.out.print("Num " + (i + 1) + ": ");
                num[i] = reader.nextInt();
            }
            */


        /**
         * passing arras as arguments to methods
         * @param num
         */
        /*
         public static void getValues(int[] num)
            {
                Scanner reader = new Scanner(System.in);

                System.out.print("Number of Inputs: " + num.length );


                for (int i = 0; i < num.length; i++)
                {
                    System.out.print("\nNumber " + (i + 1) + ": ");
                    num[i] = reader.nextInt();
                }
            }
            public  void showArray(int[] num)
            {
                for (int value : num)
                    System.out.print(value + " ");
            }
         */



        /**
         * Comparing arrays
         */
        /*
         public static void main(String[] args)
        {

            int[] firstArray = {5,10,15,20,25};
            int[] secondArray = {5,10,15,20,25};

           if (Arrays.equals(firstArray, secondArray))
           {
               System.out.print("The arrays are equals one another");
           }
            else
           {
               System.out.print("The arrays are not equal to one another");
           }
        }
         */

    }
