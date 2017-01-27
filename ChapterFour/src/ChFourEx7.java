import java.util.Scanner;

/**
 * Created by Matthew on 1/25/2017.
 */
public class ChFourEx7
{

        private static  int fatGram;
        private static int calories;

        public static void Dis()
        {

            Scanner reader = new Scanner(System.in);
            System.out.print("Enter in Calories: ");
            int cal = reader.nextInt();
            System.out.print("Enter in Fat: ");
            StoreInput(cal,reader.nextInt());

            double cFF = CalFromFat();

             if (!(cFF > calories))
             {
                 if (cFF < (double)(calories * .3))
                 {
                     System.out.print("Calories from fat: " + cFF
                     + "\nThis food is low on fat");
                 }
                 else
                 {
                     System.out.print("Calories from fat: " + cFF
                             + "\nThis food is high on fat");
                 }
             }
            else
             {
                System.out.print("Invalid Input");
             }


        }

        public static void StoreInput(int Calories, int FatGram)
        {
            calories = Calories;
            fatGram = FatGram;
        }

        public static double CalFromFat()
        {
            return (fatGram * 9);
        }


}
