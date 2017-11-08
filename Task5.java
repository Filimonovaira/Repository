
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the first IP");
      String strIp1=in.nextLine();
      System.out.println("Enter the second IP");
      String strIp2=in.nextLine();
      System.out.println("Enter subnet mask");
      String strSM=in.nextLine();
      if (strIp1.length()==0 || strIp2.length()==0 || strSM.length()==0) System.out.println("error. Empty string");
      try{
          int [] ip1=stringInIntArray(strIp1);
          int [] ip2=stringInIntArray(strIp2);
          int [] sM=stringInIntArray(strSM);
          int [] subnet1 = new int[4];
          int [] subnet2 = new int[4];
          boolean comparison=true;
          for(int i=0;i<4;i++){
              if (ip1[i]<255 || ip2[i]<255 || sM[i]<255){
                  if(comparison){
                  subnet1[i]=sM[i]&ip1[i];
                  subnet2[i]=sM[i]&ip2[i];
                  if (subnet1[i]!=subnet2[i]){
                      comparison = false;
                       break;
                  }}
              }
              else{
                  System.out.println("Error");
                  break;
              }
          }
          System.out.println(comparison? "These Ip are on the same subnet":"These Ip aren't on the same subnet");
      }
      catch(Exception e){
          System.out.println("Error");
      }

    }
        static int[] stringInIntArray(String s){
        int[] a = new int[4];
        int n1=0;
        int n2;
        for(int i=0;i<4;i++){
        if (i==3) n2=s.length();
        else{
        n2=s.indexOf(".");}
        String s2=s.substring(n1,n2);
        a[i]=Integer.parseInt(s.substring(n1,n2));
        if (i!=3){
        s=s.substring(n2+1,s.length());
        }}
        return a;
    }
    
}
