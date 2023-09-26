import java.util.*;
public class factorial {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n;
        int i=1;
        int fac=1;
        System.out.println("enter the no.");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            fac=fac*i;
           

        }
         System.out.println(fac);

        
    }
    
}
