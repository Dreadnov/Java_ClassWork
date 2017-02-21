import javax.swing.*;

/**
 * Created by Matthew on 2/16/2017.
 */
public class ChSevenEx3_ChargeAccountValidation
{
    //Binary search local variables
    private static int first,last,middle,position;
    private static boolean found;
    private static  int result;

    //End binary search
    private static int accountChargeUInput;
    private static int[] chargeAccountNumbers ={5658845,4520125,7895122,8777541,8451277,1302850,
                                                8080152,4562555,5552012,5050552,7825877,1250255,
                                                1005231,6545231,3852085,7576651,7881200,4581002};
    // gets and sets
    public static int getFirst()
    {
        return first;
    }
    public static void setFirst(int first)
    {
        ChSevenEx3_ChargeAccountValidation.first = first;
    }

    public static int getLast()
    {
        return last;
    }
    public static void setLast(int last)
    {
        ChSevenEx3_ChargeAccountValidation.last = last;
    }

    public static int getMiddle()
    {
        return middle;
    }
    public static void setMiddle(int middle)
    {
        ChSevenEx3_ChargeAccountValidation.middle = middle;
    }

    public static int getPosition()
    {
        return position;
    }
    public static void setPosition(int position)
    {
        ChSevenEx3_ChargeAccountValidation.position = position;
    }

    public static boolean isFound()
    {
        return found;
    }
    public static void setFound(boolean found)
    {
        ChSevenEx3_ChargeAccountValidation.found = found;
    }

    public static int getAccountChargeUInput()
    {
        return accountChargeUInput;
    }
    public static void setAccountChargeUInput(int accountChargeUInput)
    {
        ChSevenEx3_ChargeAccountValidation.accountChargeUInput = accountChargeUInput;
    }

    public static int[] getChargeAccountNumbers()
    {
        return chargeAccountNumbers;
    }
    public static void setChargeAccountNumbers(int[] chargeAccountNumbers)
    {
        ChSevenEx3_ChargeAccountValidation.chargeAccountNumbers = chargeAccountNumbers;
    }

    // sequentialSearch method
    private static int sequentialSearch(int[] chargeAccountNumbers, int value)
    {
        int i = 0;
        int element = -1;
        boolean found = false;

        while (!found && i < chargeAccountNumbers.length)
        {
            if (chargeAccountNumbers[i] == value)
            {
                found = true;
                element = i;
            }
            i++;
        }
        return element;
    }
    // validation and display of for the final outcome
    public static void val()
    {
        result = sequentialSearch(chargeAccountNumbers, getAccountChargeUInput()) ;
        if (result == -1)
        {
            JOptionPane.showMessageDialog(null,"The ID: " + getAccountChargeUInput() + " was Invalid.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"The ID: " + getAccountChargeUInput() + " was valid.");
        }
    }
}
