import java.io.Reader;
import java.util.Scanner;

/**
 * Created by Matthew on 1/23/2017.
 */
public class ChThreeEx10
{
    String name,type;
    int age;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }




    public void petY()
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter in your pets name: ");
        name = reader.next();
        System.out.print("Enter in the Type of animal it is: ");
        type = reader.next();
        System.out.print("Enter in the age of the pet: ");
        age = reader.nextInt();
        System.out.print("\n\n");

        System.out.printf("Your Pets Name: " + getName() + "\n");
        System.out.printf("Your Pets Type: " + getType() + "\n");
        System.out.printf("Your Pets Age: " + getAge() + "\n");

    }



}
