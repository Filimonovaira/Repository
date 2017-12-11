
package mainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class ListenerNumbers  implements ActionListener {
    CalculatorGUI calc;
    ListenerAnswer listenAn;
    ListenerNumbers(CalculatorGUI calc,ListenerAnswer listenAn){
    this.calc = calc;
    this.listenAn=listenAn;
    }
public void actionPerformed(ActionEvent e){
    JButton clickedButton= (JButton)e.getSource(); 
    String clickedNumber = clickedButton.getText();
    String calcText = calc.text.getText();
    if(calcText.indexOf(".")==-1){
    calc.text.setText(calcText + clickedNumber);
    }
    else{
    listenAn.clear();
    calc.text.setText( clickedNumber);
        
    }
}
    
}
