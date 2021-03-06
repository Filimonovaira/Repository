
package mainPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Sum {
    private ArrayList <Integer> number = new ArrayList <Integer> ();
    private ArrayList <Integer> operation = new ArrayList <Integer> ();
    private double answer;
    Caching cache;
    Sum(ArrayList<Integer> number, ArrayList<Integer> operation, Caching cache) {
      this.number=number;
      this.operation=operation;
      this.cache=cache;
      Server.answer = solveOnPriority();
    }

    public double solveOnPriority (){
        
            for (int i = 0; i < operation.size(); i++) {
                if ((operation.get(i) == 3) || (operation.get(i) == 4)){
                    number.set(i,solve(i));
                    i--;         
                }
                if (!operation.contains(4) & !operation.contains(3)){
                    break;
                }
            }
            do {
            for (int i = 0; i < operation.size(); i++) {
                number.set(i,solve(i));
                    i--;         
            }
            }while(operation.size()!=0);
            answer = number.get(0);

        return answer;
    }
    public int solve (int index){
        Operation op = new Operation(number.get(index),number.get(index+1),operation.get(index));
        cache.caching(op);
          operation.remove(index);
          number.remove(index+1);
         return (int)op.getAnswer();
     }
    public void clear(){
         operation.clear();
         number.clear();
         answer=0;
     }

}
