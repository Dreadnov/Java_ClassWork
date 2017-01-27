/**
 * Created by Matthew on 1/24/2017.
 */
public class ChFourEx2
{
    double userInput,min,hours,days;//Declared fields
    public double getUserInput(double v)
    {
        return userInput;
    }//gets the users input
    public void setUserInput(double userInput)
    {
        this.userInput = userInput;
    }//sets the user input

    public void calcInput()
    {
        if (userInput >= 60)//seeing if the current input is valid
        {
            if (userInput >= 60)
            {
                min = userInput / 60;//current seconds divided by the amount of seconds in a min
                System.out.printf("Total Minutes: %,5.2f\n", min);//displays the result
            }
            if (userInput >= 3600)
            {
                hours = userInput / 3600;//current seconds divided by the amount of seconds in an hour
                System.out.printf("Total Hours: %,5.2f\n", hours);
            }
            if (userInput >= 86400)
            {
                days = userInput / 86400;//current seconds divided by the amount of seconds on a day
                System.out.printf("Total Days: %,5.2f\n", days);
            }
        }
        else
        {
            System.out.print("User Input is Invalid.");//will only display if the current user input is invalid
        }
    }
}
