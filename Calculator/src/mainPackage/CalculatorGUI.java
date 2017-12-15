
package mainPackage;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

 class CalculatorGUI extends JFrame{
    private JButton [][] number;
    private JButton [] operations;
    private Socket socket;
    JTextField text;
     
     CalculatorGUI(){
    super("Calculator");
    //setSize(700, 700);
    setLocationRelativeTo(null);
        try {
            socket = new Socket("localhost", 8080);
            ListenerAnswer listenAn = new ListenerAnswer (this,socket);
            ListenerOperations listenOp = new ListenerOperations (this,listenAn);

    //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    text= new JTextField(30);
    JPanel mainPanel = new JPanel();
     mainPanel.setLayout(new BorderLayout()); 
     mainPanel.add(text,BorderLayout.NORTH);
        mainPanel.add(addButtonsNumber(listenAn));
        mainPanel.add(addButtonsOperations(listenOp,listenAn),BorderLayout.EAST);
        setContentPane(mainPanel);     
        } catch (IOException ex) {
        
        }
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent event){
                try {
                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                     out.writeBoolean(false);
                } catch (IOException ex) {
                    Logger.getLogger(CalculatorGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.exit(0);
            }
        });

   }   
     private JPanel addButtonsNumber(ListenerAnswer listenAn){
         ListenerNumbers  listen = new ListenerNumbers (this,listenAn);
        JPanel buttonsPanel = new JPanel(new GridLayout(4,3)); 
      number = new JButton [4][3];
        int k = 0;
        for (int i = 0;i<3; i++){
            for (int j=0;j<3;j++){
                k++;
                number[i][j]=new JButton(Integer.toString(k));
                number[i][j].addActionListener(listen);
                buttonsPanel.add(number[i][j]);
          }}
        number[3][0]=new JButton("0");
         buttonsPanel.add(number[3][0]);
         number[3][0].addActionListener(listen);
         //number[3][1]=new JButton(",");
        // buttonsPanel.add(number[3][1]);
         //number[3][1].addActionListener(listen);
         number[3][1]=new JButton("DEL");
         buttonsPanel.add(number[3][1]);
         return buttonsPanel;
  }
      private JPanel addButtonsOperations(ListenerOperations listenOp,ListenerAnswer listenAn){
 
        JPanel operationPanel = new JPanel(new GridLayout(5,1)); 
         operations = new JButton[5];
         operations[0]=new JButton("+");
         operations[0].addActionListener(listenOp);
         operationPanel.add(operations[0]);
         operations[1]=new JButton("-");
         operationPanel.add(operations[1]);
         operations[1].addActionListener(listenOp);
         operations[2]=new JButton("x");
         operationPanel.add(operations[2]);
         operations[2].addActionListener(listenOp);
         operations[3]=new JButton("/");
         operationPanel.add(operations[3]);
         operations[3].addActionListener(listenOp);
         operations[4]=new JButton("=");
         operationPanel.add(operations[4]);
         operations[4].addActionListener(listenAn);
         number[3][1].addActionListener(listenOp);
        return operationPanel;
      }
       public void Run(){

        this.setVisible(true);
       }
       public void newText(String str){
           text.setText(str);
       }
  
}
