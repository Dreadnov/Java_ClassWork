/**
 * Created by Matthew on 1/24/2017.
 */
public class ChFourEx2
{
    double userInput,min,hours,days;
    public double getUserInput(double v)
    {
        return userInput;
    }
    public void setUserInput(double userInput)
    {
        this.userInput = userInput;
    }
    public void calcInput()
    {
        if (userInput > 60 )
        {
            min = userInput/60;
            System.out.printf("Total Minutes: %,5.2f\n", min);
        }
        if(userInput > 3600)
        {
            hours = userInput / 3600;
            System.out.printf("Total Hours: %,5.2f\n", hours);
        }
        if (userInput > 86400)
        {
            days = userInput / 86400;
            System.out.printf("Total Days: %,5.2f", days);

        }

    }






}
