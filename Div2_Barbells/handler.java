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
//need to refactor. cant use barbelladder in the main prolly need to use non static type.