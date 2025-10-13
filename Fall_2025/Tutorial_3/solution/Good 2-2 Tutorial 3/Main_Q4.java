import java.util.Scanner;
import java.lang.Math;

public class Main_Q4 {

    public static void main(String[] args) {
        double x1, x2, y1, y2;
        double distance;

        Scanner scan = new Scanner(System.in);

        System.out.print ("Enter the coordinates of the first point " + "(put a space between them): ");

        x1 = scan.nextDouble();
        y1 = scan.nextDouble();

        System.out.print ( "Enter the coordinates of the second point: ");

        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        //Compute the Distance

        distance = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));

        //Print Out the Answer

        System.out.println ("\nThe distance between the points (" + x1 + "," + y1 +") and (" + x2 + "," + y2 + ") is: " + distance);

    }
}