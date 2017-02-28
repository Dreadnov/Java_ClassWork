/**
 * Created by Matthew on 2/23/2017.
 */
public class ChNineEx5_PassFailExam extends ChNineEx4_GradeActivity
{
    //fields
    private double pass;

    //passes the information to hte setScore method
    public ChNineEx5_PassFailExam(double pass)
    {
        this.pass = pass;
        setScore(pass);
    }
}
