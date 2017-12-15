
package mainPackage;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

 public class Logging {
    //Path path= Paths.get("D:\\Java\\Repository\\Calculator\\log.txt");
   void loggingNow(){
        try {
           // Files.createFile(path);
           Date today = new Date();
           PrintWriter writer = new PrintWriter("logging.txt", "UTF-8");
           writer.println(today +"Tergerge");
           writer.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Logging.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
