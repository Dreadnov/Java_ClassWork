import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by Matthew on 2/1/2017.
 */
public class ChFiveEx5
{
    static int floor;// will grab the users imputed amount
    static int rooms;// gets the rooms per floor
    static int emptyRoom;// will get the users imputed for the emptyRoom
    static int filledRooms;// will get the users imputed for the filledRooms
    static double totalrom;// will accumulate the total rooms
    static double avg;// get the total average
    static int totalEmpty = 0;// gets the total empty rooms
    static int totalFilled = 0;// gets the total filled rooms
    static double totalRooms = 0;// gets the total rooms

    public static int getFloor()
    {
        return floor;
    }
    public static void setFloor(int floor)
    {
        ChFiveEx5.floor = floor;
    }

    private static void GetFloors()// asks the
    {
        do
        { Scanner reader = new Scanner(System.in);
            System.out.print("Enter in the amount of floors the hotel have:");
            setFloor( reader.nextInt());
            if (getFloor() <= 0 )
            {
                System.out.print("\nERROR Invalid Input: " + getFloor() + "\n\n");
            }
        }
        while(getFloor() <= 0);
    }
    private static void GetRooms()
    {

        Scanner reader = new Scanner(System.in);
        for (int i = 1; i <= getFloor() ; i++)
        {
            do
            {
                System.out.print("\nHow many rooms are on Floor " + i + " ");
                rooms = reader.nextInt();
             if (rooms >= 10)
             {
                 do
                 {
                     System.out.print("Enter in the amount that are empty: ");
                     emptyRoom = reader.nextInt();
                     System.out.print("Enter in the amount that are filled: ");
                     filledRooms = reader.nextInt();
                     totalrom = emptyRoom + filledRooms;
                 }
                 while (totalrom != rooms);
                 totalEmpty += emptyRoom;
                 totalFilled += filledRooms;
                 totalRooms += rooms;
             }
                else
             {
                 System.out.print("Invalid input enter in a valid output");
             }
            }
            while (rooms <= 9);
        }
        avg = totalFilled / totalRooms;
    }

    public static void GetCalc()
    {
        DecimalFormat percent = new DecimalFormat("#0.00%");
                System.out.println("\n\n\nHotel Chart \n------------------------\nTotal Floors: " + getFloor() + "\nTotal Rooms: " + (int) totalRooms + "\nTotal Vacant: " + totalEmpty + "\nFilled Rooms: " + totalFilled
                        + "\nHotel average " + percent.format(avg));
    }
    public static void Display()
    {
        GetFloors();
        GetRooms();
        GetCalc();
    }
}
