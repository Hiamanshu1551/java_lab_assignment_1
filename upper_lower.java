import java.util.*;
public class upper_lower {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'z' ){
    
        System.out.println( ch + " is an lower Alphabet");}
        else if(ch >= 'A' && ch <= 'Z'){
        System.out.println(  ch+ " is  an upperAlphabet");
        }
        else{
            System.out.println("enter the alphabet");
        }
    }
    
}
