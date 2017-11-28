
package mainPackage;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
    Path path= Paths.get("D:\\Java\\Repository\\Calculator\\log.txt");
    Logging(){
        try {
            Files.createFile(path);
            Date today = new Date();
            //Files.write(path, today);
            
        } catch (IOException ex) {
            Logger.getLogger(Logging.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
