import java.util.Scanner;
/**
 * Created by Matthew on 1/20/2017.
 */
public class ChThreeEx3
{
    private String name,address;
    private int age;
    private long phoneNumber;
    //grabs the output and imput from the user
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public long getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void yInfo()
    {
        //this will display the output for the user to fill out
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter in your name: ");
        name = reader.nextLine();
        System.out.println("Enter in your address: ");
        address = reader.nextLine();
        System.out.println("Enter in your phone number: ");
        phoneNumber = reader.nextLong();
        System.out.println("Enter in your age: ");
        age = reader.nextInt();
    }


}
