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
    public static ArrayList<Integer> addNums(ArrayList<Integer> plates){
        for(int i = 0; i <= plates.size()-1;i++){
            for(int k = i + 1;k <= plates.size()-1;k++){
                if(i == k){

                }
            }
        }
                
            }
        }
        

        return plates;
    }


}
