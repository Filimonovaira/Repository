
package mainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ListenerOperations implements ActionListener {
    CalculatorGUI calc;
    ListenerAnswer listenAn;
    ListenerOperations(CalculatorGUI calc,ListenerAnswer listenAn){
    this.calc = calc;
    this.listenAn=listenAn;
    }
    public void actionPerformed(ActionEvent e){
    JButton clickedButton= (JButton)e.getSource(); 
    String clickedOperation = clickedButton.getText();
    String calcText = calc.text.getText();

    if (clickedOperation.equals("+")){
        listenAn.setNumber(Integer.parseInt(calcText));
        listenAn.setOperation(1);
            calc.text.setText("");
    }
    else if (clickedOperation.equals("-")){
        listenAn.setNumber(Integer.parseInt(calcText));
        listenAn.setOperation(2);
            calc.text.setText("");
        
    }
    else if (clickedOperation.equals("x")){
        listenAn.setNumber(Integer.parseInt(calcText));
        listenAn.setOperation(3);
            calc.text.setText("");
        
    }
    else if (clickedOperation.equals("/")){
        listenAn.setNumber(Integer.parseInt(calcText));
        listenAn.setOperation(4);
            calc.text.setText("");
        
    }
     else if (clickedOperation.equals("DEL")){
            listenAn.clear();
            calc.text.setText("");
        
    }

}
    
}
