/**
 * Created by Matthew on 1/12/2017.
 */
import java.util.Scanner;

public class MaleAndFemalePercentages
{
    public static void main(String[] args)
    {
        double male,female,totalPeople,calcMale,calcFemale;

        Scanner reader = new Scanner(System.in);
        System.out.println("How many men are in the class: ");
        male = reader.nextDouble();
        System.out.println("How many women are in the class: ");
        female = reader.nextDouble();
        totalPeople = male + female;
        calcMale = male  / totalPeople;
        calcFemale = female  / totalPeople;
        System.out.println("There are a total of: " + calcMale + " Male\nThere are a total of: " + calcFemale + "Females"  );

    }
}
