
package mainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListenerAnswer implements ActionListener {
    CalculatorGUI calc;
    double answer;
    private ArrayList <Integer> number = new ArrayList <Integer> ();
    private ArrayList <Integer> operation = new ArrayList <Integer> ();
    Caching cache = new Caching();
    ListenerAnswer(CalculatorGUI calc){
    this.calc = calc;
        }
    public void actionPerformed(ActionEvent e){
         String calcText = calc.text.getText();     
         number.add(Integer.parseInt(calcText));
         Sum sum = new Sum(this,number,operation,cache);
            calc.text.setText(Double.toString(answer));  
    }
        public void setNumber (int d){
        number.add(d);
    }
       public void setOperation (int op){
        operation.add(op);
     }
      public void setAnswer (double answer){
        this.answer=answer;
     }
      boolean empty(){
          if (answer==0){
              return true;
          }
          return false;
      }
           public void clear(){
         operation.clear();
         number.clear();
         answer=0;
     }

}
