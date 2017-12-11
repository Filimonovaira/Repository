
package mainPackage;

import java.util.ArrayList;

public class Caching {
   static ArrayList <Operation> firstLevel = new ArrayList<Operation>(10);
   static ArrayList <Operation> secondLevel= new ArrayList<Operation>();
   Cachingwindow window = new Cachingwindow();
    void caching(Operation oper) {
        comparison(oper);
        oper.getAnswer();

        window.cacheShow(this);   
        window.pack(); 
        window.setVisible(true);
    }
   void comparison(Operation oper){
        boolean flag =false;
        for(int i=0;i<firstLevel.size();i++){
           if(equalsOperation(oper,firstLevel.get(i))){
              oper.setAnswer(firstLevel.get(i).getAnswer());
              Operation a =firstLevel.get(i);
              firstLevel.remove(i);
              firstLevel.add(0,a);
              flag =true;
              break;
              }  
        }
        if(!flag){
     for (int i=0;i<secondLevel.size();i++){
         if(equalsOperation(oper,secondLevel.get(i))){
              oper.setAnswer(secondLevel.get(i).getAnswer());
              if (firstLevel.size()==10){
                  secondLevel.add(firstLevel.get(9));
                  firstLevel.remove(9);
                 } 
              Operation b =secondLevel.get(i);
              secondLevel.remove(i);
              firstLevel.add(0,b);
              flag =true;
              break;
              }
     }
     }
             if(!flag){
              if(firstLevel.size()==10){
                 secondLevel.add(firstLevel.get(9));
                 firstLevel.remove(9);
              oper.setAnswer(solve(oper.getNumber1(),oper.getNumber2(),oper.getOperation()));
              firstLevel.add(0,oper);   
              } 
             else {
                  oper.setAnswer(solve(oper.getNumber1(),oper.getNumber2(),oper.getOperation()));
                  firstLevel.add(0,oper);
             }
        }     
   }
       int solve (int number1,int number2,int operation){
        int res = 0;
         switch(operation){
             case 1:
                res=number1+number2; 
                break;
             case 2:
                res=number1-number2; 
                break;
             case 3:
                res=number1*number2; 
                break;
             case 4:
                res=number1/number2; 
                break;
         }
         return res;
   }
 boolean equalsOperation (Operation oper1,Operation oper2){
      if ((oper1.getNumber1()==oper2.getNumber1()) && (oper1.getNumber2()==oper2.getNumber2()) && (oper1.getOperation()==oper2.getOperation())){
              return true;
          }         
        return false;
     }
}
