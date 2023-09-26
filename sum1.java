import java.util.*;
public class sum1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int s=0;
        while(i<=n){
            if(i%2==0){
                s=s+i;
              
            }
            i++;
             
            
           
        }
        System.out.println(s);
       

      
    }
    
}
