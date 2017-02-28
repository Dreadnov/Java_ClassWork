/**
 * Created by Matthew on 2/23/2017.
 */
public class ChNineEx5_FinalExam extends ChNineEx4_GradeActivity
{
    //fields
    private double examF;

    //passes the information to hte setScore method
    public ChNineEx5_FinalExam(double examF)
    {
        this.examF = examF;
        setScore(examF);
    }
}
