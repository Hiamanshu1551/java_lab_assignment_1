import java.util.*;
public class switch_evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n%2==0?0:1;
        switch(c){
            case 0:{System.out.println("even");}
            break;
            case 1:{System.out.println("odd");}
            break;

            }
        }
    }
    

