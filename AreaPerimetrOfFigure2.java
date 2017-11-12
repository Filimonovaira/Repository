
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;


public class AreaPerimetrOfFigure2 {

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
        System.out.println ("Enter the coordinates");
         int x1=in.nextInt();
         int y1=in.nextInt();
         int x2=in.nextInt();
         int y2=in.nextInt();
         int x3=in.nextInt();
         int y3=in.nextInt();
         int a=length(x1,y1,x2,y2);
         int b=length(x2,y2,x3,y3);
         int c=length(x3,y3,x1,y1);
         s=areaAndPer.area(a,b,c);
         p=areaAndPer.perimetr(a,b,c);
        }
    else if ( figure.equalsIgnoreCase("circle")){
        System.out.println ("Enter the coordinates of the center and points on the circle");
         int x1=in.nextInt();
         int y1=in.nextInt();
         int x2=in.nextInt();
         int y2=in.nextInt();
         int r = length(x1,y1,x2,y2);
         s=areaAndPer.area(r);
         p=areaAndPer.perimetr(r);
        }
    else if ( figure.equalsIgnoreCase("square")){
        System.out.println ("Enter the coordinates of the side");
         int x1=in.nextInt();
         int y1=in.nextInt();
         int x2=in.nextInt();
         int y2=in.nextInt();
         int a = length(x1,y1,x2,y2);
         s=areaAndPer.area(a,a);
         p=areaAndPer.perimetr(a,a);
        }
    else if ( figure.equalsIgnoreCase("rectangle")){
        System.out.println ("Enter the coordinates of the two sides by order");
         int x1=in.nextInt();
         int y1=in.nextInt();
         int x2=in.nextInt();
         int y2=in.nextInt();
         int x3=in.nextInt();
         int y3=in.nextInt();
         int a=length(x1,y1,x2,y2);
         int b=length(x2,y2,x3,y3);
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
    final int length(int x1,int y1,int x2, int y2){
        int l=(int)Math.abs(Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
        return l;
    }
}