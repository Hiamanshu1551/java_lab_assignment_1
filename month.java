import java.util.*;

public class month {
    public static void main(String[] args){
        System.out.println("enter the month");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=7){
            if(n%2==0 && n!=2){
                System.out.println("30 days");
            }
            else if(n==2){
                System.out.println("28 days");
            }
            else{
                System.out.println("31 days");
            }
            
        }
        else if(n>7){
            if(n%2==0){
                System.out.println("31 days");
            }
            else{
                System.out.println("30 days");
            }

            }
        }
    }
    

