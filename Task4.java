
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     System.out.print("Enter the string:");
     String str,rts;
     rts="";
     str=in.nextLine();
     int n = str.length();
     for (int i=n-1;i>-1;i--){
         rts+=str.charAt(i);
     }
     System.out.print("Inverted string:"+rts);
     
    }
    
}
