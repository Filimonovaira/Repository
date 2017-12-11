
package mainPackage;

import java.util.ArrayList;

public class Operation {
    private int number1;
    private int number2;
    private int operation;
    private double answer;
    Operation(int number1,int number2,int operation){
        this.operation=operation;
        this.number1=number1;
        this.number2=number2;
    }
    double getAnswer(){
        return answer;
    }
    int getOperation(){
        return operation;
    }
    int getNumber1(){
        return number1;
    }
    int getNumber2(){
        return number2;
    }

    void setAnswer(double answer){
        this.answer=answer;
    }
   // void lookupInCache (Caching cach){
    //    cach.comparison(this);
   // }


}
