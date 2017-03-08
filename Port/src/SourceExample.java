/**
 * Created by Matthew on 3/8/2017.
 */

/**Import Statement*/
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**Extends a parent class / implements Interface*/
public class SourceExample extends Parent implements InterFace
{
    /**Instance Field*/
    private String name;
    private double worth;

    /**Static Member*/
    private static char rank;

    /**Aggregation*/
    private Object someObj = null;

    /**Constructor*/
    SourceExample(){
        /**This Reference*/
        this.name = "unnamed Object";
        this.worth = 1.23456789;
        rank = 'k';
    }

    /**Overloaded Constructor*/
    SourceExample(String Name, double Worth, char Rank){
        /**This Reference*/
        this.name = Name;
        this.worth = Worth;
        rank = Rank;
    }

    /**Instance Method*/
    private void ifElseIfDemo(){
        /**(if)/(if-else)/(if-else-if) Statements*/
        /**Comparing Strings*/
        if(this.name.equals("A Demo"))
            System.out.println(this.name);
        else if(!this.name.equals("A Demo")){
            this.name = "A Demo";
            System.out.println(this.name);
        }
    }
    /**Overloaded Method*/
    private void ifElseIfDemo(String Name){
        System.out.println(Name);
    }
    private void switchDemo(){
        /**Switch*/
        /**DecimalFormat*/
        DecimalFormat formatter = new DecimalFormat("#0.00");
        switch (rank) {
            case 'k' : {
                System.out.println("Worth: " + formatter.format(worth));
                break;
            }
            default : {
                System.out.println("Worthless");
                break;
            }
        }
    }
    private void loopDemo(){
        Scanner reader = new Scanner(System.in);
        String userInput = "";
        int accum1 = 0, accum2 = 0;

        /**(While)/(Do-While)/(For) Loops*/
        /**Sentinel Value*/
        /**Running Total*/
        while(!userInput.equals("*")){
            accum1 = 0;
            accum2 = 0;
            do{
                for (int i = 0; i < 5; i++) {
                    accum1++;
                    accum2++;
                }
            }
            while (accum2 < 5);
            userInput = reader.nextLine();
        }
        System.out.println(accum1 + " : " + accum2);
    }
    private void arrayDemo(){
        /**Array*/
        int[] intArr = {1,2,3,4,5};
        /**ArrayList*/
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < intArr.length; i++)
        {
            intList.add(intArr[i]);
        }
        /**Sequential Search*/
        System.out.println(sequentialSearch(intArr, 5));
        /**Selection Sort*/
        selectionSort(intArr);
    }
    private int sequentialSearch(int[] array, int value){
        int index = 0, element = -1;
        boolean found = false;
        while(!found && index < array.length){
            if(array[index] == value){
                found = true;
                element = index;
            }
            ++index;
        }
        return element;
    }
    private void selectionSort(int[] array){
        int startScan, index, minIndex, minValue;
        for(startScan = 0; startScan < (array.length - 1); startScan++){
            minIndex = startScan;
            minValue = array[startScan];
            for(index = startScan + 1; index < array.length; index++){
                if(array[index] < minValue)
                {
                    minValue = array[index];
                    minIndex = index;
                }
            }
            array[minIndex] = array[startScan];
            array[startScan] = minValue;
        }
    }
    /**Override toString*/
    @Override
    public String toString()
    {
        return "DemoObject{" +
                "name='" + name + '\'' +
                ", worth=" + worth +
                ", rank=" + rank +
                ", someObj=" + someObj +
                '}';
    }
    /**Override equals*/
    @Override
    public boolean equals(Object obj)
    {
        /**Polymorphism*/
        SourceExample demoObject = (SourceExample)obj;
        if(demoObject.worth == this.worth)
            return true;
        else
            return false;
    }
    /**Exception Handling / Throwing Exceptions*/
    private void exceptionDemo()throws Exception{
        try{
            Double.parseDouble(this.name);
        }
        catch (Exception e){
            e.printStackTrace();
            throw new Exception();
        }
    }
}
