class Task1{
   public static void main(String [] args){
      try{
                 int a= Integer.parseInt(args[0]);
                 int b= Integer.parseInt(args[1]);
		 int c=a+b;
		 System.out.println("Сумма чисел =" + c); 
	  }
      catch (Exception e){
		  System.out.println("Некорректные данные, введите 2 чиса"); 
	  }
     }
}
      