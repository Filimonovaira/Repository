
package mainPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Sum {
    //static double number1 = 0;
    //static double number2 = 0;
    static ArrayList <Double> operand = new ArrayList <Double> ();
    static ArrayList <Integer> operation = new ArrayList <Integer> ();
    //static String operation = "";
    //static String operation = "";
    static  void setNumber (double d){
        operand.add(d);
    }
    static  void setOperation (int op){
        operation.add(op);
    }
    static double solveOnPriority (){
        double answer = 0;
        try{
            for (int i = 0; i < operation.size(); i++) {
                if ((operation.get(i) == 3) || (operation.get(i) == 4)){
                    operand.set(i,solve(i));
                    i--;         
                }
                if (!operation.contains(4) & !operation.contains(3)){
                    break;
                }
            }
            do {
            for (int i = 0; i < operation.size(); i++) {
                operand.set(i,solve(i));
                    i--;         
            }
            }while(operation.size()!=0);
            answer = operand.get(0);
            System.out.println(operand.size());
        }
          catch (Exception e){
           System.out.println("Error");
       }  
        return answer;
    }
    static double solve (int index){
         double res = 0;
         switch(operation.get(index)){
             case 1:
                res=operand.get(index)+operand.get(index+1); 
                break;
             case 2:
                res=operand.get(index)-operand.get(index+1); 
                break;
             case 3:
                res=operand.get(index)*operand.get(index+1); 
                break;
             case 4:
                res=operand.get(index)/operand.get(index+1); 
                break;
         }
          operation.remove(index);
          operand.remove(index+1);
         return res;
     }
    static void clear(){
         operation.clear();
         operand.clear();
     }
    /*
    static double getNumber (){
        return number1;
    }
    static String getOperation (){
        return operation;
    }
*/
}
