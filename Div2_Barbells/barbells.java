import java.util.ArrayList;
import java.util.Scanner;


public class barbells{
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter in values");
            int b = scan.nextInt();
               // if(b>1){
                    //do something with next lines
                //}2
            int p = scan.nextInt();
                //dictates lines after b 
                // b += p lines in total

            int bar1 = scan.nextInt();
            int bar2 = scan.nextInt();
            int plate1 = scan.nextInt();
            int plate2 = scan.nextInt();
            int plate3 = scan.nextInt();
            int plate4 = scan.nextInt();
            int plate5 = scan.nextInt();

            ArrayList<Integer> plates = new ArrayList<>();
            plates.add(plate1);
            plates.add(plate2);
            plates.add(plate3);
            plates.add(plate4);
            plates.add(plate5);

            ArrayList<Integer> bars = new ArrayList<>();
            bars.add(bar1);
            bars.add(bar2);

            System.out.println(b);
            System.out.println(p);

            System.out.println(bars);
            System.out.println(plates);

            //takes input from the sample but not dynamically programmed yet.
            //stores them in array lists but might want to use a different and faster alg for the handling of data.
            //rough idea of how it works.
            //could use [] for the two sides of barbell
            //possibly a bst problem because the numbers grow
            //if so them possibly can be dynamically programmed for faster runtime?
            //barbell not a factor in balance calculations
            //i figured it out half of it out
            //[5,5,1,4,6] loop through till boths sides == . loop to the front too till last indext is hit.
            //add up i(0) and i(1) etc util the end of array.
            //very slow O(N)^100000000 but it technically works
            //use high performance array
            //then add bar for calculations
            //store weight in array maybe?
            //check for dupes
            //still inefficient run time
    }
}