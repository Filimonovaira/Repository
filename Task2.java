
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;


public class Task2 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter 2 numbers, enter the operation with numbers ");
        try{
       int a=in.nextInt();
       int b=in.nextInt();
       
       //System.out.print("operation");
       String operation = trim(in.nextLine());
       //System.out.println(operation);
      //boolean plys = operation.equalsIgnoreCase(" умножение");
       if ((operation.equalsIgnoreCase("add up"))|(operation.equals(" +"))){
        int c = a+b;
        System.out.println(" Expression = "+c);
    }
       if ((operation.equalsIgnoreCase("deduct"))|(operation.equals(" -"))){
        int c = a-b;
        System.out.println(" Expression = "+c);
    }
       if ((operation.equalsIgnoreCase("multiply"))|(operation.equals(" *"))){
        int c = a*b;
        System.out.println(" Expression = "+c);
    }
       if ((operation.equalsIgnoreCase("divide"))|(operation.equals(" /"))){
        double c = a/b;
        System.out.println("Expression = "+c);
    }
       else{
           System.out.println("Enter the operation with numbers. Example: +");
       }

    }
       catch (Exception e){
           System.out.println("Error, enter 2 numbers");
       }
    
}       }

