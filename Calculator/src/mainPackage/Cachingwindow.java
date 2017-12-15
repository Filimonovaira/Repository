
package mainPackage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import static mainPackage.Caching.firstLevel;
import static mainPackage.Caching.secondLevel;

public class Cachingwindow extends JFrame {

    JPanel panel = new JPanel();
       JTextArea area1 = new JTextArea( 11, 20);
       JTextArea area2 = new JTextArea( 31, 20);
    Cachingwindow(){
        super("Cache");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);
        //pack(); 
       area1.setLineWrap(true);
       area1.setWrapStyleWord(true);
       area2.setLineWrap(true);
       area2.setWrapStyleWord(true);
       area1.setText("First Level" + "\n");
       area2.setText("secondLevel"+ "\n");
       panel.add(area1);
       panel.add(area2);
}
   void cacheShow(Caching cache){
       area1.setText("First Level" + "\n");
       area2.setText("Second Level"+ "\n");
       for(int i=0;i<firstLevel.size();i++){
           switch(firstLevel.get(i).getOperation()){
             case 1:
                area1.append(Integer.toString(firstLevel.get(i).getNumber1()) + "+" + Integer.toString(firstLevel.get(i).getNumber2()) + " = " + Double.toString(firstLevel.get(i).getAnswer()) + "\n");
                break;
             case 2:
                area1.append(Integer.toString(firstLevel.get(i).getNumber1()) + "-" + Integer.toString(firstLevel.get(i).getNumber2()) + " = " + Double.toString(firstLevel.get(i).getAnswer()) + "\n");
                break;
             case 3:
                area1.append(Integer.toString(firstLevel.get(i).getNumber1()) + "*" + Integer.toString(firstLevel.get(i).getNumber2()) + " = " + Double.toString(firstLevel.get(i).getAnswer()) + "\n"); 
                break;
             case 4:
                area1.append(Integer.toString(firstLevel.get(i).getNumber1()) + "/" + Integer.toString(firstLevel.get(i).getNumber2()) + " = " + Double.toString(firstLevel.get(i).getAnswer()) + "\n");
                break;
         }
           
      
       }
       for(int i=0;i<secondLevel.size();i++){
           switch(secondLevel.get(i).getOperation()){
             case 1:
                area2.append(Integer.toString(secondLevel.get(i).getNumber1()) + "+" + Integer.toString(secondLevel.get(i).getNumber2()) + " = " + Double.toString(secondLevel.get(i).getAnswer()) + "\n");
                break;
             case 2:
                area2.append(Integer.toString(secondLevel.get(i).getNumber1()) + "-" + Integer.toString(secondLevel.get(i).getNumber2()) + " = " + Double.toString(secondLevel.get(i).getAnswer()) + "\n");
                break;
             case 3:
                area2.append(Integer.toString(secondLevel.get(i).getNumber1()) + "*" + Integer.toString(secondLevel.get(i).getNumber2()) + " = " + Double.toString(secondLevel.get(i).getAnswer()) + "\n"); 
                break;
             case 4:
                area2.append(Integer.toString(secondLevel.get(i).getNumber1()) + "/" + Integer.toString(secondLevel.get(i).getNumber2()) + " = " + Double.toString(secondLevel.get(i).getAnswer()) + "\n");
                break;
         }
       }
       
       setContentPane(panel);
   }

}