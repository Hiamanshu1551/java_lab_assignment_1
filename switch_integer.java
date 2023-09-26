import java.util.*;
public class switch_integer {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n>0?1:n<0?-1:0;
        switch(c){
            case 1:{System.out.println("positive");}
            break;
            case 0:{System.out.println("zero");}
            break;
            case -1:{System.out.println("negative");}
            break;
        }
    }
    
}
