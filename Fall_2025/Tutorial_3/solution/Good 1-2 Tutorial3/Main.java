public class Main{

    enum Directions { North, South, West, East}

    public static void main (String [] args){

       Directions dir1, dir2, dir3, dir4;
       dir1 = Directions.North;
       dir2 = Directions.South;
       dir3 = Directions.West;
       dir4 = Directions.East;

       System.out.println("Direction 2 value: " + dir2);
       System.out.println("Direction 2 ordinal: " + dir2.ordinal());
       System.out.println("Direction 2 name: " + dir2.name() + "\n");

       System.out.println("Direction 3 value: " + dir3);
       System.out.println("Direction 3 ordinal: " + dir3.ordinal());
       System.out.println("Direction 3 value: " + dir3.name());

    }


}
