import java.util.Scanner;
/**
 * Created by Matthew on 1/20/2017.
 */
public class ChThreeEx3Launcher
{

    public static void main(String[] args)
    {



        ChThreeEx3[] person = new ChThreeEx3[3];
        //fills the array
        for (int i = 0; i < person.length ; i++)
        {
            person[i] = new ChThreeEx3();
            person[i].yInfo();
        }
        //displays the output based on the index
        System.out.println("Name: " + person[0].getName());
        System.out.println("Age: " + person[0].getAge());
        System.out.println("Phone Number: " + person[0].getPhoneNumber());
        System.out.println("Address: " + person[0].getAddress());
        System.out.println("\n");
        System.out.println("Name: " + person[1].getName());
        System.out.println("Age: " + person[1].getAge());
        System.out.println("Phone Number: " + person[1].getPhoneNumber());
        System.out.println("Address: " + person[1].getAddress());
        System.out.println("\n");
        System.out.println("Name: " + person[2].getName());
        System.out.println("Age: " + person[2].getAge());
        System.out.println("Phone Number: " + person[2].getPhoneNumber());
        System.out.println("Address: " + person[2].getAddress());
    }


}
