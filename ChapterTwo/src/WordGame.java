import java.util.Scanner;

/**
 * Created by Matthew on 1/12/2017.
 */
public class WordGame
{
    public static void main(String[] args)
    {
        String name,age,city,college,profession,animal,petName;



        Scanner reader = new Scanner(System.in);


        System.out.println("Enter Name: ");
        name = reader.nextLine();
        System.out.println("Enter Age: ");
        age = reader.nextLine();
        System.out.println("Enter City: ");
        city = reader.nextLine();
        System.out.println("Enter College:");
        college = reader.nextLine();
        System.out.println("Enter Profession: ");
        profession = reader.nextLine();
        System.out.println("Enter Animal: ");
        animal = reader.nextLine();
        System.out.println("Enter Pets name: ");
        petName = reader.nextLine();

        System.out.println("There ounce was a person named " + name + " who lived in " + city + ". At the age of "
                + age + ",\n" + name + " went to college at " + college + ". " + name + " graduated and went to work as a\n "
                + profession  + ". Then," + name + " adopted a(n)" + animal + " named " + petName + ". They both lived \n happily ever after."  );

    }
}
