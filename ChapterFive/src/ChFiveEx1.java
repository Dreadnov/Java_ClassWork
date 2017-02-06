/**
 * Created by Matthew on 1/31/2017.
 */
public class ChFiveEx1
{
    static int userInput;// gets the users input

    public int getUserInput()
    {
        return userInput;
    }
    public void setUserInput(int userInput)
    {
        this.userInput = userInput;
    }// grabs the users input

    // grabs the user input and starts at one and goes to the user input
    public static int Evaluate()
    {
        int sum = 0;//
        for (int i = 1; i <= userInput ; i++)
        {
            sum += i;// The number goes from 1,2,3,4,5,6 tell the users inputted number
        }
        return sum; // returns all the values of the loop
    }


}
