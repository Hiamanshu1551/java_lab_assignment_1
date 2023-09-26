import java.util.*;
public class first_last {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n;
        System.out.println("enter the range");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the no.");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();}

        for(int i=0;i<n;i++){
                System.out.print(a[i]);
            }
        
        for(int i=0;i<n;i++){
            if(i==0 || i==n){
                System.out.println("first digit of a no.");
                System.out.println(a[i]);
                 
                System.out.println("last digit of a no.");
                System.out.println(a[n-1]);
            }
           
        }
            
        

        
        
        
        
        

        

    }
    
}
