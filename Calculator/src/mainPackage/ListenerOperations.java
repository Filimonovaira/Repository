
package mainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ListenerOperations implements ActionListener {
    CalculatorGUI calc;
    ListenerOperations(CalculatorGUI calc){
    this.calc = calc;
    }
    public void actionPerformed(ActionEvent e){
    JButton clickedButton= (JButton)e.getSource(); 
    String clickedOperation = clickedButton.getText();
    String calcText = calc.text.getText();
    if (clickedOperation.equals("+")){
        Sum.setNumber(Double.parseDouble(calcText));
        Sum.setOperation("+");
            calc.text.setText("");
    }
    else if (clickedOperation.equals("-")){
        Sum.setNumber(Double.parseDouble(calcText));
        Sum.setOperation("-");
            calc.text.setText("");
        
    }
    else if (clickedOperation.equals("x")){
        Sum.setNumber(Double.parseDouble(calcText));
        Sum.setOperation("x");
            calc.text.setText("");
        
    }
    else if (clickedOperation.equals("/")){
        Sum.setNumber(Double.parseDouble(calcText));
        Sum.setOperation("/");
            calc.text.setText("");
        
    }
     else if (clickedOperation.equals("DEL")){
            Sum.number1=0;
            Sum.number2=0;
            Sum.operation="";
            calc.text.setText("");
        
    }

}
    
}
