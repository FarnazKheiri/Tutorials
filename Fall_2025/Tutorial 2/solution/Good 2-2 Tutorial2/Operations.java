import java.lang.Math;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Operations {
    public static void main(String[] args){
        double volume, surface_area, radius;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius of sphere");
        radius = scan.nextFloat();

        volume =  4*PI*Math.pow(radius,3)/3;
        surface_area =  4*PI*Math.pow(radius,2);
        System.out.println("The value of the volume is " + (float) (volume) + " m^3");
        System.out.println("The value of the surface area is " + (float) (surface_area)+ " m^2");
    }
}
