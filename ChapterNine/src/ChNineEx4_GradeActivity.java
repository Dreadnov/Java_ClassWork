/**
 * Created by Matthew on 2/23/2017.
 */
public class ChNineEx4_GradeActivity
{
    //fileds
    private double score;
    //default constructor
    public ChNineEx4_GradeActivity() {}

    //Getters and setters for their respected fields
    public void setScore(double s) { score = s;}
    public double getScore(){ return score; }

    //GetGrade uses if else statements that check the incoming score to the parameters below
    public char getGrade()
    {
        char letterGrade;
        if (score >= 90){letterGrade = 'A';}
        else if (score >= 80){letterGrade = 'B';}
        else if (score >= 70){letterGrade = 'C';}
        else if (score >= 60){letterGrade = 'D';}
        else {letterGrade = 'F';}

        return letterGrade;
    }
}
