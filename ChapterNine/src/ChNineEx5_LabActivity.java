/**
 * Created by Matthew on 2/24/2017.
 */
public class ChNineEx5_LabActivity extends ChNineEx4_GradeActivity
{
    //fields
    private double lab;

    //passes the information to hte setScore method
    public ChNineEx5_LabActivity(double lab)
    {
        this.lab = lab;
        setScore(lab);
    }
}
