
package mainPackage;

public class Calculator {
    public static void main (String [] args){
        CalculatorGUI calc = new CalculatorGUI(); //Создаем экземпляр 
        calc.pack(); 
       calc.setVisible(true);
       //new CalculatorGUI().setVisible(true);
        
    }
}
