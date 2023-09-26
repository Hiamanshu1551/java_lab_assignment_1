import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n ,rev;
        System.out.println("enter the no.");
        n=sc.nextInt();
        while(n>0){
            rev=n%10;
            n=n/10;
            System.out.print(rev);
        }
    }
    
}
