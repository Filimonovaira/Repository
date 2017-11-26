
package mainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class ListenerNumbers  implements ActionListener {
    CalculatorGUI calc;
    ListenerNumbers(CalculatorGUI calc){
    this.calc = calc;
    }
public void actionPerformed(ActionEvent e){

    JButton clickedButton= (JButton)e.getSource(); 
    String clickedNumber = clickedButton.getText();
    String calcText = calc.text.getText();
    calc.text.setText(calcText + clickedNumber);
}
    
}
