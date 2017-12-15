
package mainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListenerAnswer implements ActionListener {
    CalculatorGUI calc;
    double answer;
    private ArrayList <Integer> number = new ArrayList <Integer> ();
    private ArrayList <Integer> operation = new ArrayList <Integer> ();
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    ListenerAnswer(CalculatorGUI calc,Socket socket){
    this.calc = calc;
    try {
           
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {

        }
        }
    @Override
    public void actionPerformed(ActionEvent e){
         String calcText = calc.text.getText();     
         number.add(Integer.parseInt(calcText));
          
        try {
            //Logging log = new Logging();
            //log.loggingNow();
            out.writeBoolean(true);
            out.writeInt(number.size());
            for(int i=0;i<number.size();i++){
               out.writeInt(number.get(i)); 
            }
            out.writeInt(operation.size());
            for(int i=0;i<operation.size();i++){
               out.writeInt(operation.get(i)); 
            }
            answer=in.readDouble();
        } catch (IOException ex) {

        }
      
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
