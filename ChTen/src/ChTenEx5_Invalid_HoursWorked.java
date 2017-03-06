/**
 * Created by Matthew on 3/2/2017.
 */
public class ChTenEx5_Invalid_HoursWorked extends Exception
{
    //specifies the text of the new exception
    ChTenEx5_Invalid_HoursWorked(){super("The number of hours worked is invalid.");}
    //sends the exception message if the catch is called
    ChTenEx5_Invalid_HoursWorked(String msg){super(msg);}
}
