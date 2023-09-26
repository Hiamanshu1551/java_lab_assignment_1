import java.util.*;
public class div {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        if(n%3==0){
            System.out.println("dvisible by 3");
        }
        else if(n%5==0){
            System.out.println("divisible by5");
        }
        else{
            System.out.println("not divisible by 3 and 5");
        }
    }
    
}
