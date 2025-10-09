package tutorialsecondyear;

import java.util.Scanner;
//import java.lang.Math;
import java.util.Random;

public class Tutorial1 {
	public static void main(String [] args) {
 	   Scanner sc = new Scanner(System.in);
 	   
//Question 1
 	   double x = 32;
 	   double y = 8;
 	   //part1
 	    double Squareofy = Math.sqrt(y);
 	    System.out.println(Squareofy);
 	    
 	    //part2
 	    double power = Math.pow(x, y);
 	    System.out.println(power);
 	    
 	    //part3
 	    double logx = Math.log(x);
 	    double logy = Math.log(y);
 	    System.out.println(logx);
 	    System.out.println(logy);
 	    
 	    //part4
 	    double power2 = Math.exp(x);
 	    System.out.println(power2);
 	    
//Question 2
 	    double PI = 3.1415;
 	    System.out.println("Please enter radius: ");
 	    double radius = sc.nextDouble();
 	    
 	    double surfacearea = 4*PI*(Math.pow(radius, 2)) ;
 	    
 	    double volume = 4*PI*((Math.pow(radius, 3)/3));
 	    
 	    System.out.println("the volume is "+volume);
 	    System.out.println("the surface area is "+surfacearea);
 	    
 //Question 3 
 	   Random objGenerator = new Random();
 	   int min = 0; 
 	   int max = 25;
 	   
 	  System.out.println("7 random values: ");
 	   for(int i =0; i <7; i++) {
 	   int random = objGenerator.nextInt(24);  
 	   System.out.println(random);
 	   }
 	   
 	    
 	    
 	   
 	   
 	   

}
}
