import java.util.ArrayList;



public class handler{
    private ArrayList<Integer> plates;
    private ArrayList<Integer> bars;
    private int p;
    private int b;

    //array of plate weights
    public handler(ArrayList<Integer> plates,ArrayList<Integer> bars ,int b, int p) {
      this.plates = plates;
      this.bars = bars;
      this.p = p;
      this.b = b;
      
    }
    
    public void printStuff() {
        System.out.println("available plates");
        System.out.println(plates);

        System.out.println("available bars ");
        System.out.println(bars);

        System.out.println("number of plates");
        System.out.println(p);

        System.out.println("number of bars");
        System.out.println(b);
    }


}
