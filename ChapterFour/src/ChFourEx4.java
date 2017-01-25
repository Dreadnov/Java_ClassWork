/**
 * Created by Matthew on 1/24/2017.
 */
public class ChFourEx4
{
    int quantity,perOff,userInput;
    final double prod = 99;
    double total;

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
            total =  (userInput * prod ) / .20;

            System.out.printf("The Current total is: %s",userInput);
            System.out.printf("The Current total is: $%,.2f", total);
        }
        else if (userInput >= 20 || userInput >= 49)
        {
            total =  (userInput * prod ) / .30;

            System.out.printf("The Current total is: %s",userInput);
            System.out.printf("The Current total is: $%,.2f", total);
        }
        else if (userInput >= 50 || userInput >= 99)
        {
            total =  (userInput * prod ) / .40;

            System.out.printf("The Current total is: %s",userInput);
            System.out.printf("The Current total is: $%,.2f", total);
        }
        else if (userInput >= 100 )
        {
            total =  (userInput * prod ) / .50;

            System.out.printf("The Current total is: %s",userInput);
            System.out.printf("The Current total is: $%,.2f", total);
        }

    }




}
