import java.util.*;
public class palindrom {
    public static void main(String[] args ){
        int n;
        int rev =0;
        
     
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        n=sc.nextInt();
        int i=n;
        while(n>0){
            rev=(rev*10)+n%10;
            n=n/10;
            

        }
        if(i==rev){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not palindrom");
        }

    }
    
}
