/**
 * Created by Matthew on 3/2/2017.
 */
public class ChTenEx5_PayrollClassException extends Exception
{
    //specifies the text of the new exception
    public ChTenEx5_PayrollClassException(){super("Invalid user input for Employee's Name");}
    //sends the exception message if the catch is called
    public ChTenEx5_PayrollClassException(String msg) {super(msg);}
}
