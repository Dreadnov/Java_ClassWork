/**
 * Created by Matthew on 2/2/2017.
 */
public class ChFiveEx6
{
    double StartPop;//Start pop
    double popIncrease;//population increase
    double multiPerDay;// multipe per day


    public double getStartPop()
    {
        return StartPop;
    }//gets te starting pop
    public void setStartPop(double startPop)
    {
        StartPop = startPop;
    }//sets the starting pop

    public double getPopIncrease()
    {
        return popIncrease / 100;
    }//calculates the pop increase divided by 100
    public void setPopIncrease(double popIncrease)
    {
        this.popIncrease = popIncrease;
    }//sets the pctincrease

    public double getMultiPerDay()
    {
        return multiPerDay;
    }//gives the the amount of days
    public void setMultiPerDay(double multiPerDay)
    {
        this.multiPerDay = multiPerDay;
    }//sets the users amount of days
}
