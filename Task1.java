class Task1{
   public static void main(String [] args){
      try{
                 int a= Integer.parseInt(args[0]);
                 int b= Integer.parseInt(args[1]);
		 int c=a+b;
		 System.out.println("Sum of numbers =" + c); 
	  }
      catch (Exception e){
		  System.out.println("Error, enter 2 numbers"); 
	  }
     }
}
      