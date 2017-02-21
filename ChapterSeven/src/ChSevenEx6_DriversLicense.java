import java.util.Arrays;

/**
 * Created by Matthew on 2/17/2017.
 */
public class ChSevenEx6_DriversLicense
{
    // answers for the questions
    private  String[] correctAnswers = {"B","D","A","A","C","A","B","A","C","D","B","C","C","D","A","D","C","C","B","D","A"};

    private  String[] getArr = {};
    private  int totalCorrect;
    private  int totalIncorrect;
    private  int[] questionsMissed = new int[20];
    private int count= 0;

    private  boolean passed = false;

    public int[] getQuestionsMissed()
    {
        return questionsMissed;
    }
    public void setQuestionsMissed(int questions)
    {

        this.questionsMissed[count] = questions;
        count++;
    }

    public String[] getGetArr()
    {
        return getArr;
    }
    public void setGetArr(String[] getArr)
    {
        this.getArr = getArr;
    }

    public ChSevenEx6_DriversLicense(String[] getArr)
    {
        for (int i = 0; i < correctAnswers.length; i++)
        {
            if (getArr[i].equals(correctAnswers[i]))
            {
                totalCorrect++;
            }
            else
            {
                totalIncorrect++;
            }
            if ((!getArr[i].equals(correctAnswers[i])))
            {
                setQuestionsMissed(i);
            }
        }

        if (totalCorrect < 15)
        {
            passed = true;
        }
        else
        {
            passed= false;
        }

        vin();
    }

    public void vin()
    {
        System.out.print("You: " + passed);
        System.out.print("\nTotal Correct: " + totalCorrect);
        System.out.print("\nTotal Missed: " + totalIncorrect);
        for (int i = 0; i < getQuestionsMissed()[i]; i++)
        {
            System.out.print("\nQuestion: " + Arrays.toString(questionsMissed));
        }

    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChSevenEx6_DriversLicense that = (ChSevenEx6_DriversLicense) o;

        if (!Arrays.equals(correctAnswers, that.correctAnswers)) return false;

        return true;
    }
}
