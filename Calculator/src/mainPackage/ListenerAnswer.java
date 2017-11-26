
package mainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerAnswer implements ActionListener {
    CalculatorGUI calc;
    double answer;
    ListenerAnswer(CalculatorGUI calc){
    this.calc = calc;
        }
    public void actionPerformed(ActionEvent e){
         String calcText = calc.text.getText();
         if (Sum.operation.equals("+")){
            answer=Sum.number1+Double.parseDouble(calcText);
            calc.text.setText(Double.toString(answer));
         }
         else if (Sum.operation.equals("-")){
            answer=Sum.number1-Double.parseDouble(calcText);
               calc.text.setText(Double.toString(answer));
         }
         else if (Sum.operation.equals("x")){
            answer=Sum.number1*Double.parseDouble(calcText);
               calc.text.setText(Double.toString(answer));
         }
         else if (Sum.operation.equals("/")){
            answer=Sum.number1/Double.parseDouble(calcText);
               calc.text.setText(Double.toString(answer));
         }

    }
}
