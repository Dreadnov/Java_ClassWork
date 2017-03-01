/**
 * Created by Matthew on 3/1/2017.
 */
public class ChTenEx4_InvalidString extends Exception
{
    ChTenEx4_InvalidString()
    {
        super("Invalid Month Name");
    }
    ChTenEx4_InvalidString(String msg)
    {
        super(msg);
    }
}
