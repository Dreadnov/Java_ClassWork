/**
 * Created by Matthew on 2/23/2017.
 */
public class ChNineEx4_Essay extends ChNineEx4_GradeActivity
{
    //fields
    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;
    private double total;

    //Getters and setters for their respected fields
    public double getGrammar()
    {
        return grammar;
    }
    public void setGrammar(double grammar)
    {
        this.grammar = grammar;
    }
    public double getSpelling()
    {
        return spelling;
    }
    public void setSpelling(double spelling)
    {
        this.spelling = spelling;
    }
    public double getCorrectLength()
    {
        return correctLength;
    }
    public void setCorrectLength(double correctLength)
    {
        this.correctLength = correctLength;
    }
    public double getContent()
    {
        return content;
    }
    public void setContent(double content)
    {
        this.content = content;
    }

    // arg-constructor that uses the super call and also uses grammar,spelling ,correctLength and  content
    public ChNineEx4_Essay(double grammar, double spelling, double correctLength, double content)
    {
        super();
        this.grammar = grammar;
        this.spelling = spelling;
        this.correctLength = correctLength;
        this.content = content;
        total = grammar + spelling + correctLength + content;
        setScore(total);

    }
    /*
    @Override
    public String toString()
    {
        return "Grammar Score: " + getGrammar() +
                "\nSpelling Score: " + getSpelling() +
                "\nCorrect Length Score: " + getCorrectLength() +
                "\nContent Score: " + getContent() +
                "\nFinal Grade: " + getGrade() + "(" + getScore() + ")" ;
    }
     */

}
