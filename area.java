import java.util.*;

class area{
   void area_of_circle(double r ){
    double radius=3.14*r*r;
    System.out.println(radius);
   }
   void area_of_rectangle(int a, int b){
    int area=a*b;
    System.out.println(area);

   }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length and bredth");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("enter the radius");
    double r=sc.nextDouble();
    area ar= new area();
    ar.area_of_circle(r);
    ar.area_of_rectangle(a,b);

   }




}
