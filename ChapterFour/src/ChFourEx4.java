/**
 * Created by Matthew on 1/24/2017.
 */
public class ChFourEx4
{
    int quantity,perOff,userInput;
    final double prod = 99;
    double grossTotal;
    double netTotal;

    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getPerOff()
    {
        return perOff;
    }
    public void setPerOff(int perOff)
    {
        this.perOff = perOff;
    }

    public int getUserInput()
    {
        return userInput;
    }
    public void setUserInput(int userInput)
    {
        this.userInput = userInput;
    }

    public void calc()
    {
        if (userInput >= 10 || userInput >= 19)
        {
            grossTotal =  (userInput * prod );
            netTotal = grossTotal - (grossTotal * .20);

            System.out.printf("The Current grossTotal is: %s\n",userInput);
            System.out.printf("The Final grossTotal is: $%,.2f", netTotal);
        }
        else if (userInput >= 20 || userInput >= 49)
        {
            grossTotal =  (userInput * prod );
            netTotal = grossTotal - (grossTotal * .30);


            System.out.printf("The Current grossTotal is: %s\n",userInput);
            System.out.printf("The Final grossTotal is: $%,.2f", netTotal);
        }
        else if (userInput >= 50 || userInput >= 99)
        {
            grossTotal =  (userInput * prod);
            netTotal = grossTotal - (grossTotal * .40);

            System.out.printf("The Current grossTotal is: %s\n",userInput);
            System.out.printf("The Final grossTotal is: $%,.2f", netTotal);
        }
        else if (userInput >= 100 )
        {
            grossTotal =  (userInput * prod );
            netTotal = grossTotal - (grossTotal * .50);

            System.out.printf("The Current grossTotal is: %s",userInput);
            System.out.printf("The Final grossTotal is: $%,.2f", netTotal);
        }

    }




}
