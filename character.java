import java.util.*;
public class character{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char n=sc.next().charAt(0);
        if((n>='a'&&n<='z')||(n>='A'&&n<='Z')){
            System.out.println(n+"is a alphabet");
        }
        else if(n>=48 && n<=57){
            System.out.println(n+"is a digit");
        }
        else if(n>=33 && n<=47){
            System.out.println("is a special character");
        }

    }
}