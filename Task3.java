
import java.util.Scanner;


public class Task3 {

    public static void main(String[] args) {
   try{
       System.out.print("Enter number:");
       Scanner in = new Scanner(System.in);
       int x= in.nextInt();
       //int y=0;
       long f = 1L;
       f=factorial(x);
       System.out.println("Factorial = "+f);
       
   }
   catch(Exception e){
       System.out.println("Error");
   }
    }
    static long factorial (int x){
        if (x==1){
            return 1;
        }
        long f = 1L;
        f=x*factorial(x-1);
        return f;
    }
   /*
    static long factorial (int a, int b, long c){
        b+=1;
        c*=b;
        if (b == a){
            return c;
        }
        else if (b<a){
           factorial(a,b,c); 
        }
        return c;
    }
   */
}
