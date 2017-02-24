/**
 * Created by Matthew on 2/23/2017.
 */
public class ChNineEx5_Launcher
{


    public static void main(String[] args)
    {
        ChNineEx5_LabActivity labActivity = new ChNineEx5_LabActivity(86.90);
        ChNineEx5_PassFailExam passFailExam = new ChNineEx5_PassFailExam(78.50);
        ChNineEx4_Essay essay = new ChNineEx4_Essay(15,10,5,11);
        ChNineEx5_FinalExam finalExam = new ChNineEx5_FinalExam(95.12);
        ChNineEx5_CourseGrades courseGrades = new ChNineEx5_CourseGrades(labActivity,passFailExam,essay,finalExam);

        System.out.print(courseGrades);
    }
}
