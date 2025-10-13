import java.util.Random;
import java.lang.String;

public class Main_Q3
{

    public static void main(String [] args)
    {
        int die1, die2, sum;

       Random rand = new Random();

       die1 = rand.nextInt(6) + 1;
       die2 = rand.nextInt(6) + 1;

       sum = die1 + die2;

       System.out.println("Roll on First Die: " + die1);
       System.out.println("Roll on Second Die: " + die2);
       System.out.println("Sum of dice roll: " + sum);



    }



}