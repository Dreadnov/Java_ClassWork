/**
 * Created by Matthew on 3/1/2017.
 */
public class ChTenEx2_ClassCustomException extends Exception
{
    //An exception class that will trigger if called
    ChTenEx2_ClassCustomException(){super("Invalid Test Score, must be < 100 || > 0");}
    ChTenEx2_ClassCustomException(String mag) {super(mag);}
}
