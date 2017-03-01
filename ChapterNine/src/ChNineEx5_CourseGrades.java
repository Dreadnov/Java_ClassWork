import java.util.Arrays;

/**
 * Created by Matthew on 2/23/2017.
 */
public class ChNineEx5_CourseGrades implements ChNineEx6_Analyzable_Interface
{
    // an array that is initialized to  ChNineEx4_GradeActivity
    ChNineEx4_GradeActivity[] grades = new ChNineEx4_GradeActivity[4];

    //A constructor that passes the objects
    public ChNineEx5_CourseGrades(ChNineEx5_LabActivity labActivity,
                                  ChNineEx5_PassFailExam passFailExam,
                                  ChNineEx4_Essay essay,
                                  ChNineEx5_FinalExam finalExam)
    {
        this.setLab(labActivity);
        this.setPassFailExam(passFailExam);
        this.setEssay(essay);
        this.setFinalExam(finalExam);
    }
    // a method that gets the average of the objects and then returns
    public double getAverage()
    {
        double avg = 0;
        for (int i = 0; i < grades.length; i++)
        {
            avg += grades[i].getScore();
        }
        avg = avg / grades.length;

        return avg;
    }
    //Gets the highest value in the array and then displays it in the toString
    @Override
    public ChNineEx4_GradeActivity getHighest()
    {
        double high = grades[0].getScore();
        int holder = -1;
        for (int i = 0; i < grades.length; i++)
        {
            if (grades[i].getScore() > high)
            {
                high = grades[i].getScore();
                holder = i;
            }
        }
        return grades[holder];
    }

    //Gets the lowest value in the array and then displays it in the toString
    @Override
    public ChNineEx4_GradeActivity getLowest()
    {
        double low = grades[0].getScore();
        int holder = -1;
        for (int i = 0; i < grades.length; i++)
        {
            if (grades[i].getScore() < low)
            {
                low = grades[i].getScore();
                holder = i;
            }
        }

        return grades[holder];
    }

    //default constructor
    ChNineEx5_CourseGrades(){}

    //sets the array value to the corresponding object
    public void setLab(ChNineEx4_GradeActivity labActivity) { grades[0] = labActivity; }
    public void setPassFailExam(ChNineEx5_PassFailExam passFailExam){ grades[1] = passFailExam;}
    public void setEssay(ChNineEx4_Essay essay){grades[2] = essay;}
    public void setFinalExam(ChNineEx5_FinalExam finalExam){ grades[3] = finalExam;}

    //configures the toString to hte specified parameters based on the position of their current array placement
    @Override
    public String toString()
    {
        return "Lab Activity: " + grades[0].getGrade() + " (" + grades[0].getScore() + ")"  +
                "\nPass Fail Exam: " + grades[1].getGrade()+ " (" + grades[1].getScore() + ")"  +
                "\nEssay: " + grades[2].getGrade()+ " (" + grades[2].getScore() + ")"  +
                "\nFinal Exam: " + grades[3].getGrade()+ " (" + grades[3].getScore() + ")" +
                "\nAverage: " + String.format("%,.2f%%", getAverage()) +
                "\nHighest Value: " + getHighest().getScore() +
                "\nLowest Value: " + getLowest().getScore();

    }
}
