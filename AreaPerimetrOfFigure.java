
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;


public class AreaPerimetrOfFigure {

    public static void main(String[] args) {
        try{
     UserInteraction user = new UserInteraction();
        
     if (user.getArea()!=0 & user.getPerimetr()!=0){
     System.out.println ("Area = "+user.getArea());
     System.out.println ("Perimetr = "+user.getPerimetr());
     }}
        catch(Exception e){
              System.out.println("Error. Invalid input");  
                }}
    
}
interface Area{
    int area(int a,int b,int c);
    int area(int r);
    int area(int a,int b);

    int perimetr(int a,int b,int c);
    int perimetr(int r);
    int perimetr(int a,int b);

}
class AreaClass implements Area{
    @Override
    public int area(int a,int b,int c){
    double p = perimetr(a,b,c)/2;
    int s=(int)(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    return s;
}
    @Override
    public int area(int r){
    int s=(int)(Math.PI*r*r);
    return s;
}
    @Override
    public int area(int a,int b){
    int s=a*b;
    return s;
}
    @Override
    public int perimetr(int r){
    int p=(int)(Math.PI*2*r);
    return p;
}
    @Override
    public int perimetr(int a,int b,int c){
    int p=a+b+c;
    return p;
}
    @Override
    public int perimetr(int a,int b){
    int p=a+a+b+b;
    return p;
}
}
class UserInteraction{
    private int p=0;
    private int s=0;
    public UserInteraction(){
    AreaClass areaAndPer = new AreaClass();
    Scanner in = new Scanner(System.in);
    System.out.println ("Enter the geometric figure");
    String figure=trim(in.nextLine());
    if ( figure.equalsIgnoreCase("triangle")){
        System.out.println ("Enter the lengths of the three sides");
         int a=in.nextInt();
         int b=in.nextInt();
         int c=in.nextInt();
         s=areaAndPer.area(a,b,c);
         p=areaAndPer.perimetr(a,b,c);
        }
    else if ( figure.equalsIgnoreCase("circle")){
        System.out.println ("Enter radius");
         int r=in.nextInt();
         s=areaAndPer.area(r);
         p=areaAndPer.perimetr(r);
        }
    else if ( figure.equalsIgnoreCase("square")){
        System.out.println ("Enter the lengths of the side");
         int a=in.nextInt();
         s=areaAndPer.area(a,a);
         p=areaAndPer.perimetr(a,a);
        }
    else if ( figure.equalsIgnoreCase("rectangle")){
        System.out.println ("Enter the lengths of the two sides");
         int a=in.nextInt();
         int b=in.nextInt();
         s=areaAndPer.area(a,b);
         p=areaAndPer.perimetr(a,b);
        }
    else if (figure.length()==0){
         System.out.println ("Error. You entered an empty string");
    }
    else{
        
        System.out.println ("Error. Figure not recognized");
    }
       
}
    public int getArea(){
        return s;
    }
    public int getPerimetr(){
        return p;
    }
}