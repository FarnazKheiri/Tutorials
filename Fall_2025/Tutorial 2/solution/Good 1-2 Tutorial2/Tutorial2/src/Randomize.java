import java.util.Random;

public class Randomize {
    public static void main(String[] args){
        Random generator = new Random();
        int[] x = {0,0,0,0,0,0,0};
        System.out.println("The values of the 7 random numbers under 25 are : ");
        for(int i = 0;i<7;i++){
            x[i] = generator.nextInt(25);
            System.out.println(x[i] + " ");
        }
    }

}
