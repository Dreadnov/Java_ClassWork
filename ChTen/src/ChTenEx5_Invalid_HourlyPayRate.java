/**
 * Created by Matthew on 3/2/2017.
 */
public class ChTenEx5_Invalid_HourlyPayRate extends Exception
{
    //specifies the text of the new exception
    public ChTenEx5_Invalid_HourlyPayRate(){super("Invalid Hourly Pay Rate Amount");}
    //sends the exception message if the catch is called
    public ChTenEx5_Invalid_HourlyPayRate(String msg){super(msg);}
}
