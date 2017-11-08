
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
      String str1,str2;
      String sameZn = "ÅEeåÊKOÎîoPÐðpAÀàaHÍXÕõxCÑñcBÂMÌ";  // pairwise enumeration of similar symbols
      boolean sameStr;
      sameStr=true;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the first string");
      str1 = in.nextLine();
      System.out.println("Enter the second string");
      str2 = in.nextLine();
      if (str1.length()==str2.length()){
          int n=str1.length();
          for (int i=0;i<n;i++){
              if (str1.charAt(i)!= str2.charAt(i)){   
                  String sim1=Character.toString(str1.charAt(i));  //remember the symbol in these variables
                  String sim2= Character.toString(str2.charAt(i));
                  if (sameZn.contains(sim1) && sameZn.contains(sim2)){   
                      int m = sameZn.length();
                     for(int j=0;j<m;j+=2){   
                         String s = sameZn.substring(j, j+2);  
                         sameStr=a(s,sim1,sim2);   
                         if (sameStr){
                             //sameStr=false;
                             break; 
                         }
                     }
                     //sameStr=true; 
                  }
                  else{
                  sameStr=false;
                  break;
                  }
              }
              //sameStr=true;
          }
      }
      if (str1.length()==0)
              System.out.println("Invalid input. Empty string.");
      else{
      System.out.println(sameStr? "Strings are similar" : "Strings are not similar");
      }
    }
    static boolean a(String s,String sim1, String sim2){   //A method that checks if it has these symbols
        if (s.contains(sim1) && s.contains(sim2)){
            return true;
            
        }
        
                return false;
                
    }
    
}
