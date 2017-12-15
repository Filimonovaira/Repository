
package mainPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    static private ArrayList <Integer> number = new ArrayList <Integer> ();
    static private ArrayList <Integer> operation = new ArrayList <Integer> ();
    static double answer;
    static Caching cache = new Caching();
    public static void main(String args[]) {
        try {
            ServerSocket server = new ServerSocket(8080);
            Socket socket = server.accept();

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            boolean seance = in.readBoolean();         
            while (seance){ 
            int sizeNumber = in.readInt();
            for (int i=0;i<sizeNumber;i++){
                int a = in.readInt();
                number.add(a);
            }
            int sizeOperation = in.readInt();
            for (int i=0;i<sizeOperation;i++){
                int a = in.readInt();
                operation.add(a);
            }
            Sum sum = new Sum(number, operation, cache);
            out.writeDouble(answer);
            sum.clear();
            seance = in.readBoolean();
            }
            socket.close();
            System.out.println("Server Socket close!");
            System.exit(0);
        } catch (IOException ex) {

        }
        
    }

}
