
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
         Sum.setNumber(Double.parseDouble(calcText));
         answer=Sum.solveOnPriority();
            calc.text.setText(Double.toString(answer));
        

    }
}
