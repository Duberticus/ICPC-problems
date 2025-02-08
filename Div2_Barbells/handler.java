import java.util.ArrayList;
import java.util.Collections;



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

    //dublplicate checker 
    public static ArrayList<Integer> doubleChecker(ArrayList<Integer> plates){
        ArrayList<Integer> resultP = new ArrayList<>();

        for(int i = 0; i < plates.size();i++){
            for(int k = i + 1;k < plates.size();k++){
                if(plates.get(i).equals(plates.get(k))){
                  resultP.add(plates.get(i)+(plates.get(k)));
                 
                }
            }
        }
        System.err.println(resultP);
        return resultP;
    }
                    //example [5,5,1,6,4]
    public static int realChecker(ArrayList<Integer> plates, ArrayList<Integer> resultP){
        Collections.sort(plates);

        for(int i = 0; i < plates.size();i++){
            for(int k = i + 1;k < plates.size();k++){
                int compareVal = plates.get(i) + plates.get(k);
                 
                }
            }
            return comapreVal;
        }
       
       

    // add to the plate weight to the barbell
    public static ArrayList<Integer> barbellAdder(ArrayList<Integer> bars, ArrayList<Integer> resultP){
        ArrayList<Integer> resultB_P = new ArrayList<>();
        for(int i = 0; i < bars.size(); i++){
            for(int k = 0; k < resultP.size(); k++){
                resultB_P.add( resultP.get(k) + bars.get(i));


            }
        }
        System.out.println(resultB_P);
        return resultB_P;
    }

}
//feb 7 2025
//need to refactor. cant use barbelladder in the main prolly need to use non static type.
//no refactor needed. saved the data manually in main method.
//figured out the the basics version with duplicates but not yet dynamic.
//can see why it can be dynamically programmed and it can use recurssion but how????
//brute force it?
// set value to plate(0)and compare with palte(1)++? first step????
//set value to palte(0)+plate(1) then compare????
//set value to plate(0) always and then just shift the previous plate(0) to continue the loop?
//the continue adding p(0) +p(1)++ until no more is available?
//compare 0 +1 to 2 + 3?
//will the rebuild of the arrays be slow?
//python is better