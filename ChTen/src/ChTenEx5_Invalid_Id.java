/**
 * Created by Matthew on 3/2/2017.
 */
public class ChTenEx5_Invalid_Id extends Exception
{
    //specifies the text of the new exception
    public ChTenEx5_Invalid_Id(){super("An invalid output for the users ID ");}
    //sends the exception message if the catch is called
    public ChTenEx5_Invalid_Id(String msg){super(msg);}
}
